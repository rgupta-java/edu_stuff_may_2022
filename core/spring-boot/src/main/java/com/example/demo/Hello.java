package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("hello/{name}")
	public String hello(@PathVariable(name = "name")String name  ) {	
		return "hello "+name;
	}
}
