package com.dj.model;

public class Student {
	private int id;
	private String name;
	private double percentage;
	private String email;
	private Address address;
	private College college;
	
	public Student() {
		
	}

	public Student(int id, String name, double percentage, String email) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.email = email;
		System.out.println("iam using 4 argument constructor");
	}
	

	public Student(int id, String name, double percentage, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.email = email;
		this.address = address;
		System.out.println("iam using 5 argument constructor");
	}
	

	public Student(int id, String name, double percentage, String email, Address address, College college) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.email = email;
		this.address = address;
		this.college = college;
		System.out.println("iam using 6 argument constructor");
	}

	@Override
	public String toString() {
		return "Student : id=" + id + "\nname=" + name + "\npercentage=" + percentage + "\nemail=" + email + "\naddress="
				+ address + "\ncollege=" + college ;
	}

	
	
	

}
