package com.student.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@RequestMapping("/studentLogin")
	@ResponseBody
	public String studentLogin()
	{
		return "Success";
	}
}
