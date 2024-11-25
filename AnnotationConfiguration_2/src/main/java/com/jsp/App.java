package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Address;
import com.jsp.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/sample.xml");
    	Address add=(Address) context.getBean("address");
    	System.out.println(add);
    	Employee emp=(Employee) context.getBean(Employee.class);
    	System.out.println(emp);
    	String[] a=context.getBeanDefinitionNames();
    	for(String i:a)
    	{
    		System.out.println(i);
    	}
    }
}
