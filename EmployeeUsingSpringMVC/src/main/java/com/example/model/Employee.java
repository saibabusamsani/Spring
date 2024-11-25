package com.example.model;
public class Employee {
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	private int emp_depatno;
	public Employee(int emp_id, String emp_name, double emp_salary, int emp_depatno) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_depatno = emp_depatno;
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getEmp_depatno() {
		return emp_depatno;
	}

	public void setEmp_depatno(int emp_depatno) {
		this.emp_depatno = emp_depatno;
	}

	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_depatno="
				+ emp_depatno + "]";
	}
	

}
