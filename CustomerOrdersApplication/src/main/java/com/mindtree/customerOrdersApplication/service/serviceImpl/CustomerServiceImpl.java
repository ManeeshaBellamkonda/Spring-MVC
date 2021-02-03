package com.mindtree.customerOrdersApplication.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.customerOrdersApplication.entity.Customer;
import com.mindtree.customerOrdersApplication.entity.Orders;
import com.mindtree.customerOrdersApplication.repository.CustomerRepository;
import com.mindtree.customerOrdersApplication.repository.OrdersRepository;
import com.mindtree.customerOrdersApplication.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	OrdersRepository ordersRepository;

	@Override
	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void addOrders(Orders orders, String customerName,String orderName) {
		/*
		 * List<Customer> customers = customerRepository.findAll(); for (Customer
		 * customer2 : customers) { if
		 * (customer2.getCustomerName().equalsIgnoreCase(customerName)) {
		 * orders.setCustomer(customer2); } }
		 */
		Customer customer=customerRepository.findByCustomerName(customerName);
		if(orders.getOrderName().equalsIgnoreCase("shirts"))
		{
			orders.setOrderPrice(orders.getOrderQuantity()*1000);
		}
		else if(orders.getOrderName().equalsIgnoreCase("mobile"))
		{
			orders.setOrderPrice(orders.getOrderQuantity()*500);
		}
		else if(orders.getOrderName().equalsIgnoreCase("pants"))
		{
			orders.setOrderPrice(orders.getOrderQuantity()*500);
		}
		ordersRepository.save(orders);
	}

	// from rest
	@Override
	public List<Orders> getByCustomer(int customerId) {
		Customer customer = customerRepository.findById(customerId).get();
		return customer.getOrders();
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> getCustomerData(int customerId) {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer = customerRepository.findById(customerId).get();
		customerList.add(customer);
		return customerList;
	}

	@Override
	public Orders getData(int orderId) {
		Orders orders = ordersRepository.findById(orderId).get();
		return orders;
	}

	@Override
	public String updateOrders(Orders orders1, int orderQuantity, double orderPrice) {
		orders1.setOrderQuantity(orderQuantity);
		orders1.setOrderPrice(orderPrice);
		ordersRepository.save(orders1);
		return "updated";
	}

	@Override
	public Customer getAllCustomers(int customerId) {
		
		return customerRepository.findById(customerId).get();
	}

	@Override
	public void updateDetails(Customer customerList, Customer customer) {
		customerList.setCustomerName(customer.getCustomerName());
		customerList.setGender(customer.getGender());
		customerList.setDateOfBirth(customer.getDateOfBirth());
		customerList.setHobbies(customer.getHobbies());
		customerRepository.save(customerList);		
	}
}
