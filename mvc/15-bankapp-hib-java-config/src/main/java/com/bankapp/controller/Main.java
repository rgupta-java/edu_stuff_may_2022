package com.bankapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.config.AppConfig;
import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("bank.xml");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountService accountService=(AccountService) ctx.getBean("bankservice");
		
		//List<Account> all = accountService.getAll();
		accountService.transfer(1, 2, 500);
	}
}
