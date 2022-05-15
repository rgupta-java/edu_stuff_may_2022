package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.entity.Student;
import com.studentapp.repo.StudentRepo;

@SpringBootApplication
public class StudentappApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		init();
		
		
	}

	private void someMethodAutoGenQuaries() {
		
	}

	private void init() {
		repo.save(new Student("rajeev", "gupta", "r@gmail.com"));
		repo.save(new Student("ravi", "kumar", "ravi@gmail.com"));
		repo.save(new Student("anit", "gupta", "anil@gmail.com"));
		repo.save(new Student("suman", "kumari", "sk@gmail.com"));
		
		repo.save(new Student("gunika", "gupta", "gun@gmail.com"));
		repo.save(new Student("ekta",null, "ekta@gmail.com"));
	}

}
