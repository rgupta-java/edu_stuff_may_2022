package com.banakapp.dao;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.banakapp.entities.Account;
@Repository
//@Primary
public class AccountDaoJdbcImpl implements AccountDao{

	@Override
	public List<Account> getAll() {
		System.out.println("getAll using jdbc...");
		return null;
	}

	@Override
	public Account getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}

}
