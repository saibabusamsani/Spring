package com.dj;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Demo {
	@Value("muni")
	private String name;
	@Value("22")
	private int age;
	private List<AAA> a;
	public Demo(String name, int age, List<AAA> a) {
		super();
		this.name = name;
		this.age = age;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + ", a=" + a + "]";
	}
	
	
	
}
