package com.mindtree.customerOrdersApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.customerOrdersApplication.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
