package com.jsp.CreationOfBeans;

public class Employee {
	private int id;
	private String name;
	public Employee()
	{
		System.out.println("Employee bean is created");
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

	void welcome()
	{
		System.out.println("welcome to "+name);
	}

}
