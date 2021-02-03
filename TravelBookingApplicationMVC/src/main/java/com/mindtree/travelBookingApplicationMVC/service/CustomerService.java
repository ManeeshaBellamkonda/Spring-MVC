package com.mindtree.travelBookingApplicationMVC.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.travelBookingApplicationMVC.entity.Booking;
import com.mindtree.travelBookingApplicationMVC.entity.Customer;
import com.mindtree.travelBookingApplicationMVC.exception.BookingAlreadyDoneException;

@Service
public interface CustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	String addBookings(Booking booking, int customerId) throws BookingAlreadyDoneException;

	Customer viewCustomerDetails(int customerId, Date dateOfJourney);

	Booking update(int bookingId);

	String updateBooking(Booking booking1, String source, String destination, int distance);

}
