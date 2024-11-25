package com.shopping.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
@ComponentScan(basePackages = "com.shopping")
@EnableJpaRepositories(basePackages = "com.shopping")
public class Config {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean=new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("e-shoppingByUsingSpringDataJPA");
		return localEntityManagerFactoryBean;
	}
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
	}

}
