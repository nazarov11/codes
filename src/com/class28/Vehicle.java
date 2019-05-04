package com.class28;

public abstract class Vehicle {
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
		System.out.println(vehicleCount);
	}
	
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotalVehicles() {
		System.out.println("Total = " + vehicleCount);
	}

}
abstract class Car extends Vehicle{
	String a;
	Car(String a){
		this.a = a;
		System.out.println(a);
		
	}
	Car(int b){
		System.out.println(b);
	}
}
class bmw extends Car{
	
	bmw(String a){
		super(a);
		System.out.println("Java");
	}

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW drives Fast");
		
	}
	
}
class Toyota extends Car{

	Toyota(int a) {
		super(a);
		
	}

	@Override
	public void start() {
		System.out.println("Toyota starts with push button");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyota drives");
		
	}
	
}