package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		//spring is acting as a container to manged life cycle of ur beans(Passsanger, Car etc)
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("demo.xml");
		
		Passanger passanger=(Passanger) applicationContext.getBean("passanger");
		
		passanger.travel();
		
		/*	DI	=> hollywood prin...
		 * 
		 * rather then passanger looks for its dependency let spring provide that 
		 * so that we achive 100% loose coupling bw the modules
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
