package com.bankapp;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
//CommandLineRunner
@SpringBootApplication
public class Application implements CommandLineRunner{
	
	//hey sping boot have really configure em for me (EntityManger) , jdbcTemplate
	@Autowired
	private EntityManager em;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(em!=null) {
			System.out.println("great ! em is configured");
		}
		if(jdbcTemplate!=null) {
			System.out.println("great ! jdbcTemplate is configured");
		}
		System.out.println("-----------------------------");
	}

}
