package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.model.Admin;
import com.example.model.Employee;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
@Component
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbctemplate;

	public int saveEmployeeDetails(Employee employee) {

		String insert = "insert into employee(emp_name,emp_salary,emp_depatno) values(?,?,?)";

		int result = jdbctemplate.update(insert, employee.getEmp_name(), employee.getEmp_salary(),
				employee.getEmp_depatno());
		return result;

	}

	@Override
	public List<Employee> getAllEmployees() {
		String select="select * from employee";
		BeanPropertyRowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		List<Employee> listOfEmployee=jdbctemplate.query(select,rowMapper );
		return listOfEmployee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String select="select * from employee where emp_id=?";
		BeanPropertyRowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee = jdbctemplate.queryForObject(select,rowMapper, id);
		return employee;
	}

	
	
}
