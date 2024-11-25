package com.example.dao;

import java.util.List;

import com.example.model.Admin;
import com.example.model.Employee;

public interface AdminDao  {
	boolean adminLogin(String email,String password);
	int removeEmployee(int id);
	int updateEmployee(Employee employee);
}
