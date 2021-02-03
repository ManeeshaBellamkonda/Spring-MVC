package com.mindtree.customerOrdersApplication.entity;

import java.sql.Date;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private int age;
	private Date dateOfBirth;
	private String gender;
	private String hobbies;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	private List<Orders> orders;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, int age, Date dateOfBirth, String gender, String hobbies,
			List<Orders> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.hobbies = hobbies;
		this.orders = orders;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
}
