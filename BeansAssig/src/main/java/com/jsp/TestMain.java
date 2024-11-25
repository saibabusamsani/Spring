package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.product.Test;
import com.jsp.product.TestDetailes;

public class TestMain {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/testConfig.xml");
	Test test=context.getBean(Test.class);
	
	test.setNum(145);
	test.setName("sai");
	TestDetailes testInfo=context.getBean(TestDetailes.class);
	
	int n=test.getNum();
	String s=test.getName();
	
	testInfo.evenOrNot(n);
	testInfo.Armstrong(n);
	testInfo.prime(n);
	testInfo.revOfString(s);	
	}

}
