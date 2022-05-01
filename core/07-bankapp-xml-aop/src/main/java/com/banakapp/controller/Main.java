package com.banakapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.banakapp.entities.Account;
import com.banakapp.service.AccountService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bank.xml");
		
		AccountService accountService=(AccountService) ctx.getBean("accountServiceImpl");
		
		//List<Account> all = accountService.getAll();
		accountService.transfer(1, 2, 100);
	}
}
