package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.student.Student;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/studentConfig.xml");
    	Student student=context.getBean(Student.class);
    	student.setStudentid(45);
    	student.setStudentName("sai");
    	student.setStudentPercentage(70.0);
    	System.out.println(student);
    	
    	Student student1=context.getBean(Student.class);
    	student1.setStudentid(18);
    	student1.setStudentName("king");
    	student1.setStudentPercentage(40.0);
    	System.out.println(student1);
    	
    	System.out.println(student);
    }
}
