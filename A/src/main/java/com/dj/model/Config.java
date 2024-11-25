package com.dj.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	@Bean
	Student s()
	{
		Student student=new Student(e());
		return student;
	}
	@Bean
	Education e()
	{
		return new Education();
	}

}
