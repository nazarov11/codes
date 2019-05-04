package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		car.add("Jeep");
		car.add("Honda");
		car.add("Chevy");
		car.add("BMW");
		
		System.out.println("Using for loop");
		for(int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("Using advanced loop");
		for(String auto: car) {
			System.out.println(auto);
		}
		
		System.out.println("using iterator");
		Iterator<String> it = car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using while");
		int a = 0;
		while(car.size() > a) {
			System.out.println(car.get(a));
			a++;
		}
		
		
	}

}
