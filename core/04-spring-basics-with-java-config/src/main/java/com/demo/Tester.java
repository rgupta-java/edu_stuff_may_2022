package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class Tester {

	public static void main(String[] args) {
		// spring is acting as a container to manged life cycle of ur beans(Passsanger,
		// Car etc)
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Passanger passanger = (Passanger) applicationContext.getBean("passanger");

		passanger.travel();
		System.out.println("---------------------------------------------");
		Passanger passanger2 = (Passanger) applicationContext.getBean("passanger");

		passanger2.travel();

		/*
		 * DI => hollywood prin...
		 * 
		 * rather then passanger looks for its dependency let spring provide that so
		 * that we achive 100% loose coupling bw the modules
		 */
//		Vehical vehical=new Bike();
//		
//		Passanger passanger=new Passanger();
//		passanger.setName("rama");
//		passanger.setVehical(vehical);
//		
//		passanger.travel();
	}
}
