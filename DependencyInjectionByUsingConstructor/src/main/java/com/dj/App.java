package com.dj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Address;
import com.dj.model.College;
import com.dj.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("com/dj/file/sample.xml");
       Student student= context.getBean("student1",Student.class);
       System.out.println(student);
//       Address address= context.getBean(Address.class);
//       System.out.println(address);
//       
//       College clg=context.getBean(College.class);
//       System.out.println(clg);
  
    }
}
