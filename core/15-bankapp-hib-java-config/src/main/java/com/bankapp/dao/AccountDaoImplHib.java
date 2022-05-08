package com.bankapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;

@Repository
@Primary
public class AccountDaoImplHib implements AccountDao{

	private SessionFactory sessionFactory;
	
	@Autowired
	public AccountDaoImplHib(org.hibernate.SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//helper method
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Account> getAll() {
		return getSession().createQuery("select a from Account a",Account.class).getResultList();
	}

	@Override
	public Account getById(int id) {
		Account account=getSession().get(Account.class, id);
		if(account==null)
			throw new BankAccountNotFoundException("account with "+ id +" is not found");
		return account;
	}

	@Override
	public void updateAccount(Account account) {
		getSession().merge(account);// update vs merge
	}

	@Override
	public void addAccount(Account account) {
		getSession().save(account);
	}

	@Override
	public void deleteAccount(int id) {
		Account accountToDelete= getById(id);
		getSession().remove(accountToDelete);
	}

}
