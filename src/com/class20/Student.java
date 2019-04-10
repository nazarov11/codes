package com.class20;

public class Student {
	void a(int score) {
		
		if(score > 90) {
			System.out.println("A");
		}
		else if(score > 80 && score <= 90) {
			System.out.println("B");
			
		}
		else if(score > 70 && score <= 80) {
			System.out.println("C");
		}
		else if(score > 60 && score <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		}
	public static void main(String[] args) {
		Student grade = new Student();
		
		grade.a(95);
	}

}
