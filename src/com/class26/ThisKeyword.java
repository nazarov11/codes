package com.class26;

public class ThisKeyword {
	int num1, num2;
	
	public ThisKeyword() {
		System.out.println("No Parameters here");
	}
	
	ThisKeyword(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public void sum(int num1, int num2) {
		System.out.println("Sum of local variables = " + (num1 + num2));
		System.out.println("Sum of instance variables = " + (this.num1 + this.num2));
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(15, 20);
		obj.sum(15, 33);
		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(12, 13);
	}

}
