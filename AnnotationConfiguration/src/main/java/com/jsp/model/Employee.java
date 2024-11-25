package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("104")
	private int empid;
	@Value("king")
	private String empname;
	@Value("4500")
	private double empsalary;
	@Value("10")
	private int empdeptno;
	@Autowired
	@Qualifier("address2")
	private Address address;
	public Employee(int empid, String empname, double empsalary, int empdeptno, Address address) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empdeptno = empdeptno;
		this.address = address;
	}
	public Employee()
	{
		
	}
	public Employee(Address Address) {
		this.address=address;
		System.out.println("im using constructor of depedency injectin");
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public int getEmpdeptno() {
		return empdeptno;
	}
	public void setEmpdeptno(int empdeptno) {
		this.empdeptno = empdeptno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("im using setter of injection");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empdeptno="
				+ empdeptno + ", address=" + address + "]";
	}
	
	

}
