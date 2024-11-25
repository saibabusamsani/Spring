package com.jsp.employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeRegistration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,sal,deptno");
		String name=sc.next();
		double sal=sc.nextDouble();
		int deptno=sc.nextInt();
		
		Employee employee=new Employee();
		employee.setEmpName(name);
		employee.setEmpSalary(sal);
		employee.setEmpDepatno(deptno);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EmployeeJPAProject");
	EntityManager manager=entityManagerFactory.createEntityManager();
	
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	boolean result=manager.contains(employee);
	
	System.out.println("before persist : "+result);
	manager.persist(employee);
	System.out.println("aftere persist : "+manager.contains(employee));
	
	transaction.commit();
	System.out.println("employee detailes persited");
	
	manager.close();
	entityManagerFactory.close();
	
		
		
	}

}
