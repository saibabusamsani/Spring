package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.DAO.UserDao;
import com.bank.config.bankConfig;
import com.bank.model.UserInformation;

public class App 
{
    public static void main( String[] args )
    {
        UserInformation user=new UserInformation();
        user.setName("sai");
        user.setEmail("sai2001@gmail.com");
        user.setPassword("2345");
        user.setMobile_number(123445876);
        user.setAddress("Rajahmundry");
        user.setGender("male");
        ApplicationContext context=new AnnotationConfigApplicationContext(bankConfig.class);
        UserDao userDao=context.getBean(UserDao.class);
        userDao.userLogin("sai@gmail.com","sai@123");
    }
}
