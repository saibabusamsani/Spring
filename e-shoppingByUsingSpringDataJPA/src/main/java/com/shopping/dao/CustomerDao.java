package com.shopping.dao;

import com.shopping.entity.Customer;

public interface CustomerDao {
	public void cutomerRegistratin(Customer customer);
	public void deleteCustomer(Integer id);
	public void findCustomer(Integer id);
	public void findAllcustomers();
	public void customerLogin(String email,String password);
	public void findByCustomerUsingAddress(String address);
	public void findByCustomerBetweenDates(String date1,String date2);
	public Customer findByCustomerMobileOrEmailAndPassword(String email,String password);
	

}
