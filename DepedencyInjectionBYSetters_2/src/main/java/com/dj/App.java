package com.dj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Education;
import com.dj.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/dj/file/sample.xml");
      Employee emp= context.getBean(Employee.class);
      
    emp.getEducation().forEach((i)->{
    	System.out.println(i);
    });
    
    emp.getSkills().forEach((i)->{
    	System.out.println(i.getName());
    });
     
    }
}
