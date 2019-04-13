package com.class22;

public class Car {

	public static String make = "Toyota";
	String color;
	String model;
	int doors;

	Car() {
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		
		hello();

	}
	
	public static void hello() {
		//before we use any variable we have to initialize it
		String name;
		
		System.out.println("I am a static hello method ");
	}

}
