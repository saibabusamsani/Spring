package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	@RequestMapping("/go")
	@ResponseBody
	public String employeeRegistration()
	{
		
		return "employee Registratin";
	}
	@RequestMapping("/updation")
	@ResponseBody
	public String employeeUpdation()
	{
		return "employee updation";
	}
	@RequestMapping("/deletion")
	@ResponseBody
	public String employeeDeletion()
	{
		return "employee deletion";
	}
	@RequestMapping("/selection")
	@ResponseBody
	public String employeeDetailes()
	{
		return "employee detailes";
	}

}
