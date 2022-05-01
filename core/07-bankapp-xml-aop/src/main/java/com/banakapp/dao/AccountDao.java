package com.banakapp.dao;
import java.util.*;

import com.banakapp.entities.Account;

public interface AccountDao {
	public List<Account> getAll();
	public Account getById(int id);
	public void updateAccount(Account account);
	public void addAccount(Account account);
	public void deleteAccount(int id);
}
