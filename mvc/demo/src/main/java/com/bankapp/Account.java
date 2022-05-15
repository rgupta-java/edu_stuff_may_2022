package com.bankapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	private int id;
	private String name;
	private Double balance;
	
	public void foo() {
		log.info("hello to lombok :");
	}
}
