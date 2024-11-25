package com.jsp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("00605")
	private int pin;
	@Value("Rajahmundry")
	private String city;
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		System.out.println("iam using address constructor");
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
