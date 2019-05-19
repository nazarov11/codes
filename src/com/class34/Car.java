package com.class34;

public class Car {
	public String model;
	public String make;
	
	Car(String model, String make){
		this.model = model;
		this.make = make;
		
	}
	
	public void details() {
		System.out.println(make + " " + model);
	}
	
}
