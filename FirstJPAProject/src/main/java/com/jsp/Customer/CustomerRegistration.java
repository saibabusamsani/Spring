package com.jsp.Customer;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerRegistration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Customer customer=new Customer();
		System.out.println("enter cutomer_id");
		customer.setCustomerId(sc.nextInt());
		System.out.println("enter customer name");
		customer.setCustomerName(sc.next());
		System.out.println("enter email");
		customer.setCustomerEmail(sc.next());
		System.out.println("enter password");
		customer.setCustomerPassword(sc.next());
		System.out.println("enter number");
		customer.setCustomerNumber(sc.next());
		
		EntityManagerFactory manageFactory=Persistence.createEntityManagerFactory("FirstJPAProject");
		System.out.println("connection established");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		
		EntityManager manager=manageFactory.createEntityManager();
		System.out.println("creation of the platform");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		System.out.println("begin the transaction");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		
		manager.persist(customer);
		System.out.println("data inserted");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		
		transaction.commit();
		System.out.println("commited the transaction");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		manager.close();
		System.out.println("close the platform");
		System.out.println(" *-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
		manageFactory.close();
		System.out.println("close the connection");
		
		
	}

}
