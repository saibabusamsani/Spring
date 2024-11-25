package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.dao.CustomerDao;
import com.customer.entity.CustomerInformation;

@Controller
public class CustomerController {
	@Autowired
	CustomerDao customerDao;
	@RequestMapping("/registration")
	@ResponseBody
	public String registration(CustomerInformation customerInformation)
	{
		CustomerInformation customer=customerDao.customerRegistration(customerInformation);
		if(customer!=null)
		return "registration successfully ......";
		else
		{
			return "invalid detailes";
		}
	}
	@RequestMapping("/registrationpage")
	public String registrationPage()
	{
		return "Registration";
	}
}
