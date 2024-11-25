package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jsp.model.Address;
import com.jsp.model.UserInformation;

@Configuration
public class UserInformationConfig {
	
	@Bean
	UserInformation userInformationBean(){
		
		UserInformation userInformation=new UserInformation(1,"sai","Rajahmundry");
		
		return userInformation;
		
		
	}
	@Bean
	Address addressBean()
	{
		Address address=new Address(6543,"Mumbai");
		return address;
	}
	@Bean(name = "user")
	 UserInformation userInformationBean2()
	{
		UserInformation userInformation=new UserInformation();
		userInformation.setId(101);
		userInformation.setName("king");
		userInformation.setCity("Bengulore");
		userInformation.setAddress(addressBean());
		return userInformation;
		
	}

}
