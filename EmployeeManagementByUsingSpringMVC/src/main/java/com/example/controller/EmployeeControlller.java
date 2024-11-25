package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Employee;

@Controller
public class EmployeeControlller {

	@RequestMapping("/employeeRegistrationPage")
	public String employeeRegistrationPage() {

		return "EmployeeRegistration";

	}

	@RequestMapping("/employeeRegistrationDetails")
	@ResponseBody
	public String employeeRegistrationDetails(Employee employee) {

		return employee + "";

	}

}
