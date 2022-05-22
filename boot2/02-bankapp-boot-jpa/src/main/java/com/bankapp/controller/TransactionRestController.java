package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path = "transaction")
public class TransactionRestController {

	private AccountService accountService;

	@Autowired
	public TransactionRestController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//@RequestBody: it convert the json to java object
	//transfer
	@PostMapping(path = "transfer")
	public String transfer(@RequestBody  TransferDto transferDto) {
		accountService.transfer(transferDto.getFromAccountId(), transferDto.getToAccountId(),
				transferDto.getAmount());
		return "transfer is done succesfully";
	}
	
	//deposit
	@PostMapping(path = "deposit")
	public String deposit(@RequestBody  DepositDto depositDto) {
		accountService.deposit(depositDto.getAccountId(), depositDto.getAmount());
		return "deposit is done succesfully";
	}
	
	//withdraw
	@PostMapping(path = "withdraw")
	public String withdraw(@RequestBody  WithdrawDto withdrawDto) {
		accountService.withdraw(withdrawDto.getAccountId(), withdrawDto.getAmount());
		return "withdraw is done succesfully";
	}
	
}
