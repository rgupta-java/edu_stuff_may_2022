package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

//CommandLineRunner
@SpringBootApplication
public class Application implements CommandLineRunner {

	private AccountService accountService;
	
	
	@Autowired
	public Application(AccountService accountService) {
		this.accountService = accountService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		accountService.addAccount(new Account("ravi", 3000.00, "ravi@gmail.com", "54545454545"));
//		accountService.addAccount(new Account("avi", 3000.00, "avi@gmail.com", "54945454545"));
//		
		System.out.println("-----------------------------");
	}

}
