package com.dj;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Config;
import com.dj.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=new AnnotationConfigApplicationContext(Config.class);
        Student s=c.getBean(Student.class);
        System.out.println(s);
    }
}
