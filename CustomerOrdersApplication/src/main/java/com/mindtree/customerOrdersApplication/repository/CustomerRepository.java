package com.mindtree.customerOrdersApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.customerOrdersApplication.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findByCustomerName(String customerName);

}
