package com.bankapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	//getRootConfigClasses vs getServletConfigClasses
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses...");
		return new Class[] {BankAppWebConfig.class};
	}

	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses...");
		return new Class[] {BankAppModelConfig.class};
	}

	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
