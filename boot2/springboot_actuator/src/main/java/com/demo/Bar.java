package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Bar {
	public void foo() {
		System.out.println("foo method singleton");
	}
}
