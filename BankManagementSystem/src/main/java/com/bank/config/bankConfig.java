package com.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "com.bank")
public class bankConfig {
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbc=new JdbcTemplate(driverManagerDataSourceBean());
		return jdbc;
	}
	@Bean
	public DriverManagerDataSource driverManagerDataSourceBean()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/teca53");
		return dataSource;
	}

}
