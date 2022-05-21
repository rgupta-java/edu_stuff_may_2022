package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.AccountDetailDto;
import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

//bankapp/account/accounts
@RestController
@RequestMapping(path = "account")
public class AccountRestController {

	@Autowired
	private AccountService accountService;

	// ------------get--------------------
	@GetMapping(path = "accounts")
	public List<Account> getAllAccounts() {
		return accountService.getAll();
	}

	@GetMapping(path = "accounts/{id}")
	public Account getOnAccounts(@PathVariable int id) {
		return accountService.getById(id);
	}

	// @ResponseBody: convert Object -> json
	// @RequestBody: json (postman)--> java object
	// ------------post--------------------
	@PostMapping(path = "accounts")
	public Account addAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}
	// ------------delete--------------------

	@DeleteMapping(path = "accounts/{id}")
	public Account deleteAnAccount(@PathVariable int id) {
		return accountService.deleteAccount(id);
	}

	// ------------update--------------------
	@PutMapping(path = "accounts/{id}")
	public Account updateAccount(@RequestBody AccountDetailDto accountDetailDto,
			@PathVariable(name = "id") int id) {
		return accountService.updateAccount(id, accountDetailDto);
	}

	// CRUD

}
