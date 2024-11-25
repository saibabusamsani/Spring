package com;

public class Student {
	private String name;
	private int id;
	private String college;
	public Student(String name, int id, String college) {
		super();
		this.name = name;
		this.id = id;
		this.college = college;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", college=" + college + "]";
	}
	

}
