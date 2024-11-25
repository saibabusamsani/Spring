package com.jsp.product;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private int deptno;
	public void setId(int id)
	{
		String r="";
		int n=id;
		while(id!=0)
		{
			int re=id%10;
			r=++re+r;
			id/=10;
			
		}
		System.out.println(n + " next digit  : "+r);
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
		String r="";
		String s=name;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			r+=++ch;
		}
		System.out.println(s+" next char : "+r);
		
		
		this.name = name;
	}
	public double getSal() {
		
		return sal;
	}//
	public void setSal(double sal) {
		int n=6500604;
		int c=0;
		while(n!=0)
		{
			if(0==n%10)
			{
				c++;
			}
			n/=10;
		}
		System.out.println(c);
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
}
