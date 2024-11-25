package com.dj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.User;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/dj/file/sample.xml");
        User user=context.getBean(User.class);
     
        user.bikeDetaile();
        context.close();
       
    }
}
