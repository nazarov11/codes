package com.class26;

public class ThisWithConstructor {
	// this() calls current class constructor -- constructor chaining
	ThisWithConstructor(){
		this(1);
		System.out.println("No parameters");
	}
	ThisWithConstructor(int str){
		this(1,2);
		System.out.println("I have 1 String parameter " + str);
	}
	ThisWithConstructor(int str1, int str2){
		
		
		System.out.println("I have 2 String parameters " + str1 + " " + str2);
	}
	public static void main(String[] args) {

		ThisWithConstructor obj2 = new ThisWithConstructor();


	}

}
