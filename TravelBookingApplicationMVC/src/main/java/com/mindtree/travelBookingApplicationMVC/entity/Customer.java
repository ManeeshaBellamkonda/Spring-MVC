package com.mindtree.travelBookingApplicationMVC.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int customerId;
	private String fullName;
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	private List<Booking> bookings;

	public Customer() {
		super();
	}

	public Customer(int customerId, String fullName, int age, List<Booking> bookings) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.age = age;
		this.bookings = bookings;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", age=" + age + ", bookings="
				+ bookings + "]";
	}
	
	
	
}
