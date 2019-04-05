package com.class17;


public class Greetings {
	public static void main(String[] args) {
		
		Greetings obj = new Greetings();
		
		obj.hello();
		
		obj.findLargest(20, 10);
		obj.helloToInstructor("denis");
	}
	void helloToInstructor(String name) {
		System.out.println("hello " + name);
	}

	void hello() {
		System.out.println("hello");
	}
	
	void findLargest(int a, int b) {
		
	
		if(a > b) {
			System.out.println("A is larger than b");
		}
		else {
			System.out.println("b is larger than a");
		}
		
	}
	
}
