package com.dj.model;

public class Address {
	private int pin;
	private String state;
	private String street;
	private String village;
	public Address(int pin, String state, String street, String village) {
	
		this.pin = pin;
		this.state = state;
		this.street = street;
		this.village = village;
	}
	public Address() {
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", state=" + state + ", street=" + street + ", village=" + village + "]";
	}
	

}
