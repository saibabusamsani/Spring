package com.bank.model;

public class UserInformation {
	private int id;
	private String name;
	private String email;
	private String password;
	private int mobile_number;
	private String address;
	private  String gender;
	public UserInformation(int id, String name, String email, String password, int mobile_number, String address,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile_number = mobile_number;
		this.address = address;
		this.gender = gender;
	}
	public UserInformation() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobile_number=" + mobile_number + ", address=" + address + ", gender=" + gender + "]";
	}
	
	

}
