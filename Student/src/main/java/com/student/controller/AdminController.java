package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import com.student.dao.AdminDao;
import com.student.entity.StudentInformation;

@Controller
public class AdminController {
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	StudentInformation student;

	
	
	@RequestMapping("/adminLogin")
	public String adminLogin(String email,String password)
	{
	
		if(adminDao.adminLogin(email, password))
		{
			
			return "redirect:/CollegePortal";
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
	public String updateStudent(StudentInformation student)
	{
		int res=adminDao.updateStudent(student);
		return "redirect:/allEmplpoyeeDetailes";
	}
}
