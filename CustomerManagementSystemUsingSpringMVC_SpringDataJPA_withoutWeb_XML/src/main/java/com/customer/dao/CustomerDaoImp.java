package com.customer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.customer.entity.CustomerInformation;
import com.customer.repository.CustomerRepository;
@Component
public class CustomerDaoImp  implements CustomerDao{
	@Autowired
	CustomerRepository customerRepository;
	public CustomerInformation customerRegistration(CustomerInformation customerInformation)
	{
		return customerRepository.save(customerInformation);
	}


}
