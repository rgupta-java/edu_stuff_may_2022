package com.bankapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.AccountNotFoundException;
/*
 * where to use @Autowired : annotation : field , setter , ctr
 */
@Service
public class AccountServiceImpl implements AccountService{
	
	private SmsService smsService;
	
	private AccountDao accountDao;
	
	private Logger logger=LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	public void setSmsService(SmsService smsService) {
		this.smsService = smsService;
	}

	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		Account account=accountDao.getById(id);
		if(account==null)
			throw new AccountNotFoundException("account is not found " + id);
		return account;
	}

	@Override
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}

	@Override
	public void deleteAccount(int id) {
		accountDao.deleteAccount(id);
	}

	@Override
	public void transfer(int fromId, int toId, double amount) {
		//hey find out how much time this method is taking and put that into a log message: log4j2
		long start=System.currentTimeMillis();
		
		Account fromAccount=accountDao.getById(fromId);
		Account toAccount=accountDao.getById(toId);
		
		fromAccount.setBalance(fromAccount.getBalance()-amount);
		toAccount.setBalance(toAccount.getBalance()+ amount);
		
		accountDao.updateAccount(fromAccount);
		accountDao.updateAccount(toAccount);
		if(smsService!=null) {
			String message= smsService.sendSms("645645454545");
			System.out.println(message);
		}
		long end= System.currentTimeMillis();
		long timeTaken= end-start;
		
		logger.info("time taken for method to execute is"+ timeTaken);
	}

	@Override
	public void deposit(int id, double amount) {
		Account acc=accountDao.getById(id);
		acc.setBalance(acc.getBalance()+amount);
		accountDao.updateAccount(acc);
	}

	@Override
	public void withdraw(int id, double amount) {
		Account acc=accountDao.getById(id);
		acc.setBalance(acc.getBalance()-amount);
		accountDao.updateAccount(acc);
	}

}
