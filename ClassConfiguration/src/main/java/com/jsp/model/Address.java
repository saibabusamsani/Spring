package com.jsp.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int pin;
	private String state;
	
	public Address() {
	
	}
	public Address(int pin, String state) {
		super();
		this.pin = pin;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", state=" + state + "]";
	}
	

}
