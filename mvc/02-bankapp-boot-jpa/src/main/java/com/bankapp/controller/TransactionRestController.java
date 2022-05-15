package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path = "transaction")
public class TransactionRestController {

	private AccountService accountService;

	@Autowired
	public TransactionRestController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//transfer
	
	//deposit
	
	//withdraw
	
}
