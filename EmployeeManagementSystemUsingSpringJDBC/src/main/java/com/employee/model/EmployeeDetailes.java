package com.employee.model;

public class EmployeeDetailes {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private int employeeDeptno;
	
	public EmployeeDetailes() {
		super();
	}

	public EmployeeDetailes(int employeeId, String employeeName, double employeeSalary, int employeeDeptno) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDeptno = employeeDeptno;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeDeptno() {
		return employeeDeptno;
	}

	public void setEmployeeDeptno(int employeeDeptno) {
		this.employeeDeptno = employeeDeptno;
	}

	@Override
	public String toString() {
		return "EmployeeDetailes [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDeptno=" + employeeDeptno + "]";
	}
	

}
