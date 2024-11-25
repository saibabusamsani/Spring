package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.AdminDao;
import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Controller
public class AdminController {
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	EmployeeDao employeeDao;

	
	
	@RequestMapping("/adminLogin")
	public String adminLogin(String email,String password)
	{
	
		if(adminDao.adminLogin(email, password))
		{
			
			return "redirect:/allEmplpoyeeDetailes";
		}
		else
		{
			
			return "index"; 
		}
		
	}
	@RequestMapping("/remove")
	public String removeEmployee(int emp_id)
	{
		adminDao.removeEmployee(emp_id);
		return "redirect:/allEmplpoyeeDetailes";
		
	}
	@RequestMapping("/updateEmployee")
	public String updateEmployee(Employee employee)
	{
		int res=adminDao.updateEmployee(employee);
		return "redirect:/allEmplpoyeeDetailes";
	}
}
