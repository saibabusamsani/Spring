package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Admin;
import com.example.model.Employee;
@Component
public class AdminDaoImp implements AdminDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public boolean adminLogin(String email, String password) {
		// TODO Auto-generated method stub
		String select="select * from admin where email=? and password=?";
//		RowMapper<Admin> adminInfo=(rs,num)->{
//			Admin admin=new Admin();
//			admin.setId(rs.getInt(1));
//			admin.setEmail(rs.getString(2));
//			admin.setPassword(rs.getString(3));
//			System.out.println(admin);
//			return admin;
//		};
		BeanPropertyRowMapper<Admin> adminInfo=new BeanPropertyRowMapper<Admin>(Admin.class);
		try {
			Admin admin = jdbcTemplate.queryForObject(select,adminInfo,email,password);

				if(admin!=null)
				{
					return true;
				}
				else
				{
					return false;
				}
			
			
		}
		catch(Exception e)
		{
			System.out.println("failure");
			
			return false;
		}
	}
	@Override
	public int removeEmployee(int id) {
		String delete="delete from employee where emp_id=?";
		return jdbcTemplate.update(delete,id);
	}
	@Override
	public int updateEmployee(Employee emp) {
		String update="update employee set emp_name=?,emp_salary=?,emp_depatno=? where emp_id=?";
		int effectedRows = jdbcTemplate.update(update,emp.getEmp_name(),emp.getEmp_salary(),emp.getEmp_depatno(),emp.getEmp_id());
		return effectedRows;
	}

}
