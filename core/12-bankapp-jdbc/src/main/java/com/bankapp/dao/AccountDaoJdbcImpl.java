package com.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bankapp.entities.Account;

@Repository
@Primary
public class AccountDaoJdbcImpl implements AccountDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public AccountDaoJdbcImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Account> getAll() {
		return jdbcTemplate.query("select * from account", new AccountRowMapper());
	}
	@Override
	public Account getById(int id) {
		//some how i should take to tuple and convert into object
		//we have to help spring to achive it.. so i need to the job of orm myself :(
		String getByIdQuery="select * from account where id=?";
		return jdbcTemplate.queryForObject(getByIdQuery, new AccountRowMapper(), id);
	}

	@Override
	public void updateAccount(Account account) {
		String updateQuery="update account set balance=? where id=?";
		jdbcTemplate.update(updateQuery, new Object[] {account.getBalance(), account.getId()});
	}

	@Override
	public void addAccount(Account account) {
		String insertQuery="insert into account(name, balance) values(?,?)";
		jdbcTemplate.update(insertQuery, new Object[] {account.getName(), account.getBalance()});
	}

	@Override
	public void deleteAccount(int id) {
		String deleteQuery="delete from account where id=?";
		jdbcTemplate.update(deleteQuery,id);//same method update : add/del/update
	}

}
