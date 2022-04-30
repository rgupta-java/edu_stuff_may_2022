package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="vehical2" class="com.demo.Car" primary="true"/>
@Component(value = "vehical2")
@Primary
public class Car implements Vehical {
	public void move() {
		System.out.println("moving in a car");
	}
}
