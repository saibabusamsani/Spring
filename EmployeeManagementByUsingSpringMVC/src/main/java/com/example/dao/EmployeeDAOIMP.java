package com.example.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.Employee;

public class EmployeeDAOIMP implements EmployeeDAO {

	JdbcTemplate jdbctemplate;

	public int saveEmployeeDetails(Employee employee) {

		String insert = "insert into employee(employeename,employeesalary,employeedeotno) values(?,?,?); ";

		int result = jdbctemplate.update(insert, employee.getEmployeename(), employee.getEmployeesalary(),
				employee.getEmployeedeptno());
		return result;

	}

}
