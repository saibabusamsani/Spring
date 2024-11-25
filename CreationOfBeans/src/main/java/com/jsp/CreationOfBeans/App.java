package com.jsp.CreationOfBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
       
  /*
      --> if the method argument only the bean class the return type of getBean() is bean class
      --> if possible only if IOC container single bean related to the class 
   */
//       Employee employee=context.getBean(Employee.class);
       
 /*
      -->  if the getBean() method argument is both bean refernece variable 
        and bean class name and return object to specified bean class 
        
       
  */
//       Employee emp=context.getBean("emp",Employee.class);
    /*
     -->if the getBean() method argument only the reference variable 
     the return type is object class from object class down cast is to bean class
      
     
     */
      
      
    }
}
