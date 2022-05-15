package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.dto.AccountDto;
import com.bankapp.service.AccountService;

@Controller
public class AccountController {

	private AccountService accountService;

	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	

	@GetMapping(path = "accounts")
	public String allAccountsV2(ModelMap model) {
		model.addAttribute("accountsList", accountService.getAll());
		return "accounts";
	}


	@GetMapping(value = "transfer")
	public String showAccountTransferForm(ModelMap map) {
		map.addAttribute("accountDto", new AccountDto());
		return "accountform";
	}

	//correct way
	@PostMapping(value = "transfer")
	public String submittedAccountTransferForm(AccountDto accountDto, Model model) {
		
		accountService.transfer(accountDto.getFrom(), accountDto.getTo(), accountDto.getMoney());
		model.addAttribute("accountDto", accountDto);//i am putting the data  into req scope
		return "redirect:transfersuccess";
		//redirect:transfersuccess used to do redirect to the url (not the jsp page) transfersuccess
		
	}
	

	@GetMapping(value = "transfersuccess")
	public String transfersuccessMethod() {
		return "transfersuccess";
	}

	
	
	//bug : Double form submission prob
//	@PostMapping(value = "transfer")
//	public ModelAndView submittedAccountTransferForm(AccountDto accountDto) {
//		
//		accountService.transfer(accountDto.getFrom(), accountDto.getTo(), accountDto.getMoney());
//		
//		return new ModelAndView("transfersuccess", "accountDto", accountDto);// it always called rd
//	}
	
	// ModelAndView vs Model vs ModelMap
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping(path = "accounts3")
//	public String allAccountsV3(Model model) {
//		model.addAttribute("accountsList", accountService.getAll());// it automatically goes to req scope
//		return "accounts";// here u are returing logical name of the jsp
//	}

//	@GetMapping(path = "accounts")
//	public ModelAndView allAccounts(ModelAndView mv) {
//		mv.setViewName("accounts");
//		mv.addObject("accountsList", accountService.getAll());
//		return mv;
//	}
}
