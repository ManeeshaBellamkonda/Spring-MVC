package com.mindtree.travelBookingApplicationMVC.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.travelBookingApplicationMVC.entity.Booking;
import com.mindtree.travelBookingApplicationMVC.entity.Customer;
import com.mindtree.travelBookingApplicationMVC.exception.BookingAlreadyDoneException;
import com.mindtree.travelBookingApplicationMVC.service.CustomerService;

@Controller
public class AppController {

	@Autowired
	CustomerService customerService;

	Booking booking1 = new Booking();

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/form1")
	public String form1() {
		return "customer";
	}

	@PostMapping("/customer")
	public String customer(Customer customer) {
		customerService.addCustomer(customer);
		return "customer";
	}

	@RequestMapping("/form2")
	public String order(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "booking";
	}

	@PostMapping("/booking")
	public String addBookings(Booking booking, int customerId) throws BookingAlreadyDoneException {
		customerService.addBookings(booking, customerId);
		return "booking";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "view";
	}

	@GetMapping("/getCustomer")
	public String viewCustomerDetails(int customerId, Date dateOfJourney, Model model) {
		Customer customer = customerService.viewCustomerDetails(customerId, dateOfJourney);
		model.addAttribute("customer", customer);
		// System.out.println(customer);
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "view";
	}

	@RequestMapping("/update/{bookingId}")
	public String update(Model model, @PathVariable int bookingId) {
		Booking booking = customerService.update(bookingId);
		booking1 = booking;
		model.addAttribute("booking", booking);
		return "update";
	}

	@RequestMapping("/updateBookingDetails")
	public String updateBooking(@RequestParam String source, @RequestParam String destination,
			@RequestParam int distance) {
		customerService.updateBooking(booking1, source, destination, distance);
		return "index";
	}
}
