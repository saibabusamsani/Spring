package com.example.dao;

import java.util.List;

import com.example.model.Admin;
import com.example.model.Employee;

public interface EmployeeDao {
	int saveEmployeeDetails(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	

}
