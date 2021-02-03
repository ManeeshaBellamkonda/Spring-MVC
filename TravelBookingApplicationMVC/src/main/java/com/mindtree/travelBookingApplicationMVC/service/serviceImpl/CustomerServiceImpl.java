package com.mindtree.travelBookingApplicationMVC.service.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelBookingApplicationMVC.entity.Booking;
import com.mindtree.travelBookingApplicationMVC.entity.Customer;
import com.mindtree.travelBookingApplicationMVC.exception.BookingAlreadyDoneException;
import com.mindtree.travelBookingApplicationMVC.repository.BookingRepository;
import com.mindtree.travelBookingApplicationMVC.repository.CustomerRepository;
import com.mindtree.travelBookingApplicationMVC.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public String addBookings(Booking booking, int customerId) throws BookingAlreadyDoneException {

		Customer customer = customerRepository.findById(customerId).get();
		List<Booking> bookings=customer.getBookings();
		for(Booking booking2:bookings)
		{
			if(booking2.getDateOfJourney().equals(booking.getDateOfJourney()) && booking2.getSource().equalsIgnoreCase(booking.getSource()))
			{
				throw new BookingAlreadyDoneException("booking already exists");
				
			}
		}
		double price = booking.getDistance() * 10;
		if (customer.getAge() > 30) {
			booking.setPrice(price - (price * 0.05));
		} else if (customer.getAge() > 50) {
			booking.setPrice(price - (price * 0.1));
		} else {
			booking.setPrice(price);
		}
		booking.setCustomer(customer);
		bookingRepository.save(booking);
		return "inserted";
	}

	@Override
	public Customer viewCustomerDetails(int customerId, Date dateOfJourney) {
		List<Customer> customers = customerRepository.findAll();
		List<Booking> bookings = new ArrayList<Booking>();
		Customer result = new Customer();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == customerId) {
				for (Booking booking : customer.getBookings()) {
					if (booking.getDateOfJourney().equals(dateOfJourney)) {
						bookings.add(booking);
						result = customer;
					}
				}
			}
		}
		result.setBookings(bookings);
		// System.out.println(result);
		return result;
	}

	@Override
	public Booking update(int bookingId) {
		Booking booking = bookingRepository.findById(bookingId).get();
		return booking;
	}

	@Override
	public String updateBooking(Booking booking1, String source, String destination, int distance) {

		booking1.setSource(source);
		booking1.setDestination(destination);
		booking1.setDistance(distance);

		double price = booking1.getDistance() * 10;
		if (booking1.getCustomer().getAge() > 30) {
			booking1.setPrice(price - (price * 0.05));
		} else if (booking1.getCustomer().getAge() > 50) {
			booking1.setPrice(price - (price * 0.1));
		} else {
			booking1.setPrice(price);
		}
		bookingRepository.save(booking1);
		return "updated";
	}

}
