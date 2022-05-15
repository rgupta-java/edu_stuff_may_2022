package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/* ApplicationContext applicationContext= */ //?
		//we are getting the beans 
		/*
		 * String []beans=applicationContext.getBeanDefinitionNames();
		 * 
		 * for(String bean: beans) { System.out.println(bean); }
		 */
	}

}
