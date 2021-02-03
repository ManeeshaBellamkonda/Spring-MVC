package com.mindtree.customerOrdersApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.customerOrdersApplication.entity.Customer;
import com.mindtree.customerOrdersApplication.entity.Orders;
import com.mindtree.customerOrdersApplication.service.CustomerService;

@Controller
public class AppController {

	@Autowired
	CustomerService customerService;

	Orders orders1 = new Orders();
	
	Customer customerList=new Customer();
	

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
		return "orders";
	}

	@PostMapping("/orders")
	public String addOrders(Orders orders, @RequestParam String customerName,@RequestParam String orderName) {
		customerService.addOrders(orders, customerName,orderName);
		return "orders";
	}

	@GetMapping("/form3")
	public String getAllCustomerDetails(Model model) {
		List<Customer> customer = customerService.getAllCustomerDetails();
		model.addAttribute("customer", customer);
		return "view";
	}

	@GetMapping("/allData")
	public String getCustomerData(Customer customer, Model model) {
		
		List<Orders> list = customer.getOrders();
		model.addAttribute("orders", list);
		model.addAttribute("customer", customerService.getAllCustomers());
		return "view";
	}

	@GetMapping("/update/{orderId}")
	public String update(@PathVariable int orderId, Model model) {
		Orders orders = customerService.getData(orderId);
		orders1 = orders;
		model.addAttribute("orders", orders);
		return "update";
	}

	@RequestMapping("/updateOrdersDetails")
	public String updateOrders(@RequestParam int orderQuantity, @RequestParam double orderPrice) {
		customerService.updateOrders(orders1, orderQuantity, orderPrice);
		return "index";
	}
	
	@GetMapping("/viewCustomer")
	public String updateCustomer(Model model)
	{
		model.addAttribute("customer", customerService.getAllCustomers());
		return "viewCustomer";
	}
	
	@RequestMapping("/updateCustomer/{customerId}")
	public String updateCustomerDetails(@PathVariable int customerId,Model model)
	{
		Customer customer=customerService.getAllCustomers(customerId);
		model.addAttribute("customer", customer);
		customerList=customer;	
		return "updateCustomer";
	}
	
	@RequestMapping("/customerdetails")
	public String updateDetails(Customer customer,Model model)
	{
		customerService.updateDetails(customerList,customer);
		return "index";
	}
	
	
}
