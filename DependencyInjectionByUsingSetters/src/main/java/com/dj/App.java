package com.dj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/dj/file/sample.xml");
//      Employee employee= context.getBean(Employee.class);
//      System.out.println(employee);
       Employee employee= context.getBean("employee1",Employee.class);
       System.out.println(employee);
       
    }
}
