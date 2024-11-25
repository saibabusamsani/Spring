package com.student.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class StudentConfiguration {
	@Configuration
	@ComponentScan(basePackages = "com.student")
	@EnableJpaRepositories(basePackages = "com.customer.repository")
	public class studentConfig {
		@Bean(name = "viewResolver")
		public InternalResourceViewResolver toShowPathOfAllThePages() {

			InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();
			internalViewResolver.setPrefix("/");
			internalViewResolver.setSuffix(".jsp");
			return internalViewResolver;
		}

		@Bean
		public LocalEntityManagerFactoryBean entityManagerFactory() {
			LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
			bean.setPersistenceUnitName("databaseproperties");
			return bean;

		}

		@Bean
		public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
			JpaTransactionManager manager = new JpaTransactionManager();
			manager.setEntityManagerFactory(emf);	
			return manager;

		}


	}

}
