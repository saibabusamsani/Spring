package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.UserInformation;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/sample.xml");
       UserInformation user= context.getBean(UserInformation.class);
       System.out.println(user);
        
    }
}
