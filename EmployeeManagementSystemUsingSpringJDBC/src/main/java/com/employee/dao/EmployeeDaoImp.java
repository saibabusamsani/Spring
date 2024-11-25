package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.employee.model.EmployeeDetailes;
import com.employee.rowmapper.EmployeeRowMapperImp;
@Component
public class EmployeeDaoImp  implements EmployeeDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void registration(EmployeeDetailes emp) {
		String insert="insert into employee(emp_name,emp_salary,emp_depatno) values(?,?,?)";
		int res=jdbcTemplate.update(insert,emp.getEmployeeName(),emp.getEmployeeSalary(),emp.getEmployeeDeptno());
		if(res!=0)
		{	
			System.out.println("data inserted");
		}
		else
		{
			System.out.println("no data inserted");
		}
		
	}
	@Override
	public void updateSalary(double salary, int empid) {
		String update="update employee set emp_salary=? where emp_id=?";
		int res=jdbcTemplate.update(update,salary,empid);
		if(res!=0)
		{
			System.out.println("salary updated succesfully");
		}
		else
		{
			System.out.println("No data found");
		}
		
	}
	@Override
	public void updateSalaryByDeptno(double sal, int deptno) {
		String update="update employee set emp_salary=? where emp_depatno=?";
		int res=jdbcTemplate.update(update,sal,deptno);
		if(res!=0)
		{
			System.out.println("salary updated succesfully");
		}
		else
		{
			System.out.println("No data found");
		}
		
	}
	@Override
	public void deleteEmployee(String name) {
		// TODO Auto-generated method stub
		String delete="delete from employee where emp_name=?";
		int res=jdbcTemplate.update(delete,name);
		if(res!=0)
		{
			System.out.println("deleted succesfully");
		}
		else
		{
			System.out.println("No data found");
		}
		
		
	}
	@Override
	public void deleteEmployeeByLastcharR(String t) {
		// TODO Auto-generated method stub
		String delete="delete from employee where substring(emp_name,-1)=?";
		int res=jdbcTemplate.update(delete,t);
		if(res!=0)
		{
			System.out.println("deleted succesfully");
		}
		else
		{
			System.out.println("No data found");
		}
		
		
	}
	@Override
	public void fingEmpDetailesByEmpId(int empId) {
		// TODO Auto-generated method stub
		String select="select * from employee where emp_id=?";
		RowMapper<EmployeeDetailes> empDetailes=(rs,rowNum)->{
			EmployeeDetailes emp=new EmployeeDetailes();
			emp.setEmployeeId(rs.getInt(1));
			emp.setEmployeeName(rs.getString(2));
			emp.setEmployeeSalary(rs.getDouble(3));
			emp.setEmployeeDeptno(rs.getInt(4));
			System.out.println(rowNum);
			return emp;
		};
		try {
			EmployeeDetailes emp=jdbcTemplate.queryForObject(select,empDetailes,empId);
			System.out.println(emp);
		}
		catch(Exception e)
		{
			System.out.println("no employee found");
		}
		
	}
	@Override
	public void fingEmpDetailesBydeptno(int deptno) {
		// TODO Auto-generated method stub
		
			String select="select * from employee where emp_depatno=?";
			List<EmployeeDetailes> emp=jdbcTemplate.query(select, new EmployeeRowMapperImp(),deptno);
			if(emp.size()!=0)
			{
				emp.forEach((i)->{
					System.out.println(i);
				});
			}
			else
			{
				System.out.println("no employee found with : "+deptno);
				
			}
	}
	@Override
	public void findEmployeeWhoseDeptnoGreaterThanGivenDeptno(int deptno) {
		// TODO Auto-generated method stub
		String select="select * from employee where emp_depatno>?";
		BeanPropertyRowMapper<EmployeeDetailes> beanPropertyRowMapper=
				new BeanPropertyRowMapper<EmployeeDetailes>(EmployeeDetailes.class);
		List<EmployeeDetailes> list=jdbcTemplate.query(select,beanPropertyRowMapper,deptno);
		if(list.size()!=0)
		{
			System.out.println(list);
		}
		else
		{
			System.out.println("employee not found with given deptno : "+deptno);
		}
		
		
	}
	
	

}
