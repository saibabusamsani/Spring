package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.Configuration_2;
import com.jsp.config.UserInformationConfig;
import com.jsp.model.UserInformation;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(UserInformationConfig.class);
       UserInformation user=context.getBean("user",UserInformation.class);
       System.out.println(user);
       
       
       
//       ApplicationContext context1=new AnnotationConfigApplicationContext(Configuration_2.class); 
//       UserInformation user1=context1.getBean(UserInformation.class);
//       user1.displayMenu();
    }
}
