package com.example.model;

public class Employee {

	private int employeeid;
	private String employeename;
	private double employeesalary;
	private int employeedeptno;

	public Employee() {

	}

	public Employee(int employeeid, String employeename, double employeesalary, int employeedeptno) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
		this.employeedeptno = employeedeptno;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public double getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	public int getEmployeedeptno() {
		return employeedeptno;
	}

	public void setEmployeedeptno(int employeedeptno) {
		this.employeedeptno = employeedeptno;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", employeedeptno=" + employeedeptno + "]";
	}

}