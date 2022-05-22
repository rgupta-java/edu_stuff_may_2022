package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path = "tryme/{name}")
	public String hello(@PathVariable(name = "name")  String name) {
		return "life can be short but it should be sweet : "+name;
	}
}
