package com.class17;

public class Main {
	
	String carColor, carName;
	int carModelYear;
	
	public static void main(String[] args) {


	
		Main obj1 = new Main();
		obj1.carColor = "Black";
		obj1.carModelYear = 2019;
		obj1.carName = "BMW";
		System.out.println("Car color is " + obj1.carColor + " and car model year is " + obj1.carModelYear + " and car name is " + obj1.carName);
		
		Main obj2 = new Main();
		obj2.carColor = "White";
		obj2.carModelYear = 2018;
		obj2.carName = "Toyota";
		
		System.out.println("Car color is " + obj2.carColor + " and car model year is " + obj2.carModelYear + " and car name is " + obj2.carName);
		
	}
	

}
