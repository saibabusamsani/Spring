package com.dj.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("SAI")
	private String name;
	@Value("22")
	private int age;

	private Education education;
	
	public Student() {
		super();
	}
	public Student(String name, int age, Education education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}
	public Student(Education eduation)
	{
		this.education=eduation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", education=" + education + "]";
	}

}
