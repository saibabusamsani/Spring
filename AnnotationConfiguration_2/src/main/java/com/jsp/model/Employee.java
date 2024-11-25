package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("com/jsp/file/EmpDetailes.properties")
public class Employee {
	@Value("${id}")
	private int empid;
	@Value("${name}")
	private String empname;
	@Value("${sal}")
	private double empsalary;
	@Value("${deptno}")
	private int empdeptno;
	
	
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
		System.out.println("Im using empolyee constructor");
		
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
