package com.jsp.model;

public class Address {
	private int pin;
	private String city;
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
