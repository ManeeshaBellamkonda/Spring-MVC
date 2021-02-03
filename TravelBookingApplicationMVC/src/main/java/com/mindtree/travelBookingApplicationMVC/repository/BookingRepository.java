package com.mindtree.travelBookingApplicationMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelBookingApplicationMVC.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
