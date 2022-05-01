package com.banakapp.dao;

import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.banakapp.entities.Account;
@Primary
@Repository
public class AccountDaoCollectionImpl implements AccountDao{
	private Map<Integer, Account> accounts=new HashMap<>();
	
	public AccountDaoCollectionImpl() {
		accounts.put(1, new Account(1, "raj", 560000.00));
		accounts.put(2, new Account(2, "ekta", 760000.00));
	}
	@Override
	public List<Account> getAll() {
		System.out.println("getAll using hard coded collection...");
		return new ArrayList<Account>(accounts.values());
	}

	@Override
	public Account getById(int id) {
		return accounts.get(id);
	}

	@Override
	public void updateAccount(Account account) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		accounts.put(account.getId(), account);
	}

	@Override
	public void addAccount(Account account) {
		
	}

	@Override
	public void deleteAccount(int id) {
		
	}

}
