package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.demo.Car;
import com.demo.Metro;
import com.demo.Passanger;
import com.demo.Vehical;

@Configuration
//@ComponentScan(basePackages = "com.demo")
public class AppConfig {
	@Bean(name = "passanger")
	public Passanger getPassanger(Vehical vehical) {
		System.out.println("getPassanger is called");
		Passanger passanger=new Passanger();
		passanger.setName("raja");
		passanger.setVehical(vehical);
		return passanger;
	}
	@Autowired
	@Primary
	@Bean(name = "vehical1")
	public Vehical getCar() {
		System.out.println("getCar is called");
		Vehical vehical=new Car();
		return vehical;
	}
	@Autowired
	@Bean(name = "vehical1")
	public Vehical getMetro() {
		System.out.println("getMetro is called");
		Vehical vehical=new Metro();
		return vehical;
	}
	
}







