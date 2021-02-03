package com.mindtree.customerOrdersApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.customerOrdersApplication.entity.Customer;
import com.mindtree.customerOrdersApplication.entity.Orders;

@Service
public interface CustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	void addOrders(Orders orders, String customerName,String orderName);

	List<Orders> getByCustomer(int customerId);

	List<Customer> getAllCustomerDetails();

	List<Customer> getCustomerData(int customerId);

	Orders getData(int orderId);

	String updateOrders(Orders orders1, int orderQuantity, double orderPrice);

	Customer getAllCustomers(int customerId);

	void updateDetails(Customer customerList, Customer customer);

}
