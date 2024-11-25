package com.dj;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  

	public static void main( String[] args )
    {
       ApplicationContext c = new ClassPathXmlApplicationContext("com/dj/sample.xml");
      Demo bean = c.getBean(Demo.class);
      System.out.println(bean);
    }
}
