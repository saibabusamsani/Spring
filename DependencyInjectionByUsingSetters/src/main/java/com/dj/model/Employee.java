package com.dj.model;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private int deptno;
	public void setId(int id)
	{
		if(id%2==0)
		{
			System.out.println(id+" is even");
		}
		else
		{
			System.out.println(id+" is odd");
		}
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("to set name  iam using setters");
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		System.out.println("to set sal  iam using setters");
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		System.out.println("to set deptno iam using setters");
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
}
