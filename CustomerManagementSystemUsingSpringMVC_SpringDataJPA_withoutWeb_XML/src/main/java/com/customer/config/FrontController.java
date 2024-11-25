package com.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Controller
public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
			return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] configClasses= {CustomerConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] urlPatterns= {"/"};
		return urlPatterns;
	}

}
