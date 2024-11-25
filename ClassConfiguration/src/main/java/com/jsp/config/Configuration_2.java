package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jsp.model.Alpha;
import com.jsp.model.NonVeg;
import com.jsp.model.UserInformation;

@Configuration
//@ComponentScan(basePackages = "com.jsp.model")
public class Configuration_2 {
	@Bean
	UserInformation userInformation()
	{
		UserInformation userInformation=new UserInformation(nonVegBean());
		return userInformation;
	}
	@Bean
	Alpha nonVegBean()
	{
		Alpha alpha=new NonVeg();
		return alpha;
	}

}
