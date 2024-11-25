package com.dj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Address;

public class Addr {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/dj/file/sample2.xml");
		Address addr=context.getBean(Address.class);
		System.out.println(addr);
	}

}
