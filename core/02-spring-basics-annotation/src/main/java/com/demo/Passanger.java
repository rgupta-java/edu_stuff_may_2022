package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * <bean id="passanger" class="com.demo.Passanger" autowire="byType" >
		<property name="name" value="raja"/>
	</bean>
 */
@Component(value = "passanger")
public class Passanger {
	
	@Value(value = "raja")
	private String name;
	
	@Autowired
	private Vehical vehical;
	
	public void setVehical(Vehical vehical) {
		System.out.println("setVehical is called");
		this.vehical = vehical;
	}

	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	
	public void travel() {
		System.out.println("name: "+ name);
		vehical.move();
	}
}
