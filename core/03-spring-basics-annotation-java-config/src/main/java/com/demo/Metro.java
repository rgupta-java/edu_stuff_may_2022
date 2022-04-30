package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="vehical1" class="com.demo.Metro" />
@Component(value = "vehical1")
//@Primary
public class Metro implements Vehical {
	public void move() {
		System.out.println("moving in a Metro");
	}
}
