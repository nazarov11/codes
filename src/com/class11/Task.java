package com.class11;

public class Task {
	public static void main(String[] args) {
		String[] cars = {"Jeep", "Honda", "Ford", "Toyota", "Lada", "Jiguli"};
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		for(String car : cars) {
			System.out.println(car);
		}
		
	}

}
