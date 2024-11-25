package com.jsp.employee;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int id=sc.nextInt();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EmployeeJPAProject");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		
		Employee employee=manager.find(Employee.class, id);
		if(employee!=null)
		{
			manager.remove(employee);
			System.out.println("employee object is removed");
		}
		else
		{
			System.out.println("employee object not found");
		}
		
		entityTransaction.commit();
		manager.close();
		entityManagerFactory.close();
		
	}

}
