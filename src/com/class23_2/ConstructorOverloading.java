package com.class23_2;

public class ConstructorOverloading {

	ConstructorOverloading() {
		System.out.println("I am a constructor");
	}

	ConstructorOverloading(String str) {
		System.out.println("with String parameter");
	}
	ConstructorOverloading(String str, String str1){
		System.out.println("with 2 parameters");
	}
	ConstructorOverloading(int a){
		System.out.println("with int");
	}
}
