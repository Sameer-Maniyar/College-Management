package com.engineeringCollegeManagement.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	String address;
	String state;
	String city;
	String country;
	int postalCode;
	


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String address, String state, String city, String country, int postalCode) {
		super();
		this.address = address;
		this.state = state;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", state=" + state + ", city=" + city + ", country=" + country
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	

}
