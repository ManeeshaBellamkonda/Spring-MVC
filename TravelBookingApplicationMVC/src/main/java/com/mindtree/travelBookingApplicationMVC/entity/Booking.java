package com.mindtree.travelBookingApplicationMVC.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String source;
	private String destination;
	private Date dateOfJourney;
	private int distance;
	

	private String foodPreference;
	private String travellingType;
	private double price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;

	public Booking() {
		super();
	}

	public Booking(int bookingId, String source, String destination, Date dateOfJourney, int distance,
			String foodPreference, String travellingType, double price, Customer customer) {
		super();
		this.bookingId = bookingId;
		this.source = source;
		this.destination = destination;
		this.dateOfJourney = dateOfJourney;
		this.distance = distance;
		this.foodPreference = foodPreference;
		this.travellingType = travellingType;
		this.price = price;
		this.customer = customer;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}

	public String getTravellingType() {
		return travellingType;
	}

	public void setTravellingType(String travellingType) {
		this.travellingType = travellingType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", source=" + source + ", destination=" + destination
				+ ", dateOfJourney=" + dateOfJourney + ", distance=" + distance + ", foodPreference=" + foodPreference
				+ ", travellingType=" + travellingType + ", price=" + price + ", customer=" + customer + "]";
	}
	
}
