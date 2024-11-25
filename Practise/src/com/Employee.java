package com;

public abstract class  Employee {
		String name;
		int id;
		public Employee(String name,int id)
		{
			this.name=name;
			this.id=id;
		}
		abstract void calculateSal();
		void displayDetailes()
		{
			System.out.println("name : "+name);
			System.out.println("id : "+id);
		}
}
class FulltimeEmp extends Employee
{
	double monthlySal;
	public FulltimeEmp(String name,int id,double mon)
	{
		super(name,id);
		this.monthlySal=mon;
	}
	@Override
	void calculateSal() {
		System.out.println("30,00 /-");
		
	}
	
}
