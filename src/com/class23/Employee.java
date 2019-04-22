package com.class23;

public class Employee {
	
	public static String department = "IT";
	
	int salary; //default
	protected int salary1; // protected
	public void getPaid() {
		
		System.out.println("Employee gets paid " + salary);
	}
	public static void work() {
		System.out.println("Employee works in " + department);
	}

}
