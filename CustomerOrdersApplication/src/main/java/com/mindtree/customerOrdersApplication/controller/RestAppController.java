package com.mindtree.customerOrdersApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customerOrdersApplication.entity.Orders;
import com.mindtree.customerOrdersApplication.service.CustomerService;

@RestController
@RequestMapping("/rest")
public class RestAppController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/ordersByCustomer/{customerId}",method = RequestMethod.GET)
	public List<Orders> getModels(@PathVariable int customerId)
	{
		List<Orders> result=customerService.getByCustomer(customerId);
		System.out.println(result);
		return result;
	}
}
