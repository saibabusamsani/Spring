package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class UserInformation {
	
	private int id;
	private String name;
	private String city;
	
	
	private Address address;
	

	private Alpha alpha;
	
	public UserInformation(Alpha alpha) {
		this.alpha = alpha;
	}
	public UserInformation()
	{
	}
	public void displayMenu()
	{
		System.out.println(alpha.foodItem());
	}
	
	public UserInformation(int id, String name, String city) {

		this.id = id;
		this.name = name;
		this.city = city;
	}
	public UserInformation(int id, String name, String city, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", alpha="
				+ alpha + "]";
	}
	
	

}
