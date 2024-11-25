package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopping.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
		// select * from customer where customer.email=? and customer.password=?
		Customer findByEmailidAndPassword(String emailid,String password);
		List<Customer> findByAddress(String address);
		List<Customer> findByDateofbirthBetween(String date1,String date2);
		@Query("select customer  from Customer customer where (customer.emailid=?1 or customer.mobilenumber=?2) and customer.password=?3")
		Customer findByEmailidOrMobilenumberAndPassword(String emailid,String mobilenumber,String password);
	
}
