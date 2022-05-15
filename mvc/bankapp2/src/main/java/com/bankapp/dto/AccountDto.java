package com.bankapp.dto;
//DTO: u apply validation on this class (SOLID)
public class AccountDto {
	private Integer from;
	private Integer to;
	private Double money;
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	
	
}