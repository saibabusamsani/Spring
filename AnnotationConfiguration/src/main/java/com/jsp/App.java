package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Employee;


public class App 	
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/sample.xml");
        Employee emp=context.getBean(Employee.class);
        System.out.println(emp);
    }
}
