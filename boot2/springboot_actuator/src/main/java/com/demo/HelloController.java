package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private Foo foo;
	
	
	@Autowired
	private Bar bar;
	
	
	@GetMapping(path = "tryme/{name}")
	public String hello(@PathVariable(name = "name")  String name) {
		foo.foo();
		bar.foo();
		return "life can be short but it should be sweet : "+name;
	}
}
