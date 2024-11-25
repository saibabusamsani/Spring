package com.dj.model;

public class Address {
	private int pin;
	private String state;
	private String street;
	private String village;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", state=" + state + ", street=" + street + ", village=" + village + "]";
	}
	
	
	

}
