package com.student.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.student.entity.Admin;
import com.student.entity.Marks;
import com.student.entity.StudentInformation;


@Component
public class AdminDaoimp implements AdminDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public boolean adminLogin(String email, String password) {
		// TODO Auto-generated method stub
		String select="select * from admin where email=? and password=?";

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
	public int removeStudent(int id) {
		String delete="delete from college where id=?";
		return jdbcTemplate.update(delete,id);
	}
	@Override
	public int updateStudent(StudentInformation student) {
		String update="update employee set name=?,address=? where id=?";
		int effectedRows = jdbcTemplate.update(update,student.getName(),student.getAddress(),student.getId());
		return effectedRows;
	}
	@Override
	public int updateStudentMarks(Marks marks) {
		// TODO Auto-generated method stub
		String update="update marks set telugu=?,english=?,maths=? where id=?";
		int effectedRows=jdbcTemplate.update(update,marks.getTelugu(),marks.getEnglish(),marks.getMaths(),marks.getId());
		return effectedRows;
	}
	

}
