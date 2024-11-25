package com.bank.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bank.model.UserInformation;


@Component
public class UserDaoImp implements UserDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void registration(UserInformation user) {
		String insert="insert into user_information(name,email,password,mobile_number,address,gender) values(?,?,?,?,?,?)";
		int res=jdbcTemplate.update(insert,user.getName(),user.getEmail(),user.getPassword(),user.getMobile_number(),user.getAddress(),user.getGender());
		if(res!=0)
		{
			System.out.println("inserted successfully");
		}
		else
		{
			System.out.println("no data found");
		}
	}

	@Override
	public void userLogin(String email, String passowrd) {
		String select="select * from user_information where email=? and password=?";
		RowMapper<UserInformation> userDetailes=(rs,rowNum)->{
			UserInformation user=new UserInformation();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setEmail(rs.getString(3));
			user.setPassword(rs.getString(4));
			user.setMobile_number(rs.getInt(5));
			user.setGender(rs.getString(6));
			user.setAddress(rs.getString(7));
			return user;
		};
		try {
			UserInformation user=jdbcTemplate.queryForObject(select,userDetailes,email,passowrd);
			System.out.println(user);
		}
		catch(Exception e)
		{
			System.out.println("no employee found");
		}		
	}

	

}
