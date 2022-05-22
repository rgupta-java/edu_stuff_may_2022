package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Foo {
	public void foo() {
		System.out.println("foo method");
	}
}
