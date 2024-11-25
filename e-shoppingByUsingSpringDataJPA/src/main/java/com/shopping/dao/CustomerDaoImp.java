package com.shopping.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.entity.Customer;
import com.shopping.repository.CustomerRepository;
@Component
public class CustomerDaoImp implements CustomerDao {
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public void cutomerRegistratin(Customer customer) {
		Customer customer1=customerRepository.save(customer);

		System.out.println(customer1);
		
	}
	@Override
	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
		System.out.println("deleted succesfully");
		
	}
	@Override
	public void findCustomer(Integer id) {
		Customer customer=customerRepository.findById(id).orElse(new Customer());
		
		
		if(customer.getCustomerid()==null)
		{
			customer.setAddress("kphb");
			customer.setDateofbirth(Date.valueOf("2003-06-12"));
			customer.setEmailid("raju@gmsil.com");
			customer.setFirstname("raju");
			customer.setGender("male");
			customer.setMobilenumber("8765432456");
			customer.setLastname("k");
			customer.setPassword("567");
			Customer customerNew=customerRepository.save(customer);
			if(customerNew!=null)
			{
				System.out.println("accoring to your id there is no data \nso new data is added");
			}
			
		}
		
//		if(customer.isPresent())
//		{
//			Customer customerDetailes=customer.get();
//			System.out.println("customer firstName : "+customerDetailes.getFirstname());
//		}
		
		
	}
	@Override
	public void findAllcustomers() {
		List<Customer> customers=customerRepository.findAll();
		customers.forEach((i)->{
			System.out.println(i);
		});
		
	}
	@Override
	public void customerLogin(String emailid, String password) {
		Customer customer=customerRepository.findByEmailidAndPassword(emailid, password);
		if(customer!=null)
		{
			System.out.println(customer);
		}
		else
		{
			System.out.println("no customer found");
		}
		
	}
	@Override
	public void findByCustomerUsingAddress(String address) {
		List<Customer> customers=customerRepository.findByAddress(address);
		customers.forEach(i->{
			System.out.println(i);
		});
		
	}
	@Override
	public void findByCustomerBetweenDates(String date1, String date2) {
		// TODO Auto-generated method stub
		List<Customer> customers=customerRepository.findByDateofbirthBetween(date1, date2);
		customers.forEach(i->{
			System.out.println(i);
		});
		
	}
	@Override
	public Customer findByCustomerMobileOrEmailAndPassword(String emailid, String password) {
		Customer customer=customerRepository.findByEmailidOrMobilenumberAndPassword(emailid,emailid, password);
	return 	customer;
		
	}

}
