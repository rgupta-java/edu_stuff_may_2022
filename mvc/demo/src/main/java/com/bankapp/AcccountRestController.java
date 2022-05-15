package com.bankapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcccountRestController {

	//@PathVariable  vs @RequestParam
	@GetMapping(path = "accounts/{id}")
	public Account getAccountById(@PathVariable(name = "id") int id) {
		return new Account(id, "foo", 1200.00);
		
	}
}
