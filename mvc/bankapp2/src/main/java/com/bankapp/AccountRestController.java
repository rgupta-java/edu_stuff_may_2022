package com.bankapp;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path = "api")
public class AccountRestController {

	private AccountService accountService;

	@Autowired
	public AccountRestController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@GetMapping(path = "accounts")
	public List<Account> getAll(){
		return accountService.getAll();
	}
}





