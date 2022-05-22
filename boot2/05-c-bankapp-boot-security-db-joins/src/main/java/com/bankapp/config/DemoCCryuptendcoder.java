package com.bankapp.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DemoCCryuptendcoder {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("ekta121"));
		//$2a$10$Umsp7udqUjyvsmPnB471beVC21YH3UZsxgnLFGhb0gPNpjklqAwVW
		//$2a$10$BXpyJcjW2oc.Zgyc0YggXuztPwdaOPnUdKXRjbChsT/ejbjKJtbHq
	}

}
