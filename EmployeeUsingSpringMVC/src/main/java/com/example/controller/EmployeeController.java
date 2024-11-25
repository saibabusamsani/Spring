package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.EmployeeDao;
import com.example.model.Admin;
import com.example.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/employeeRegistrationDetails")
	
	public String employeeRegistration(Employee employee)
	{
		int employeeDetailes=employeeDao.saveEmployeeDetails(employee);
		if(employeeDetailes!=0)
		{
			return "redirect:/allEmplpoyeeDetailes";
		}
		else
		{
			
			return "Registration unsuccessfull";
		}
	}
	@RequestMapping("/allEmplpoyeeDetailes")
	public String employeeDetailes(Model model)
	{
		List<Employee> listOfEmplyees=employeeDao.getAllEmployees();
		model.addAttribute("listOfEmployee", listOfEmplyees);
		return "AllEmployeeDetailes";
		
	}
	@RequestMapping("/getEmployeeByID")
	public String getEmployee(String emp_id,Model model)
	{
		int id=Integer.parseInt(emp_id);
		Employee employee = employeeDao.getEmployeeById(id);
		model.addAttribute("employeeDetailes",employee);
		
		return "update";
	}
}
