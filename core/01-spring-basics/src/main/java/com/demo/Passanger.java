package com.demo;

public class Passanger {
	private String name;
	
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
