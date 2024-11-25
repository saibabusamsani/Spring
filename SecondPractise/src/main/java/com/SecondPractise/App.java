package com.SecondPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SecondPractise.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/SecondPractise/config/sample.xml");
      Employee e=(Employee) context.getBean("employee");
      System.out.println(e.getName());
    }
}
