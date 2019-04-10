package com.class20;

public class Student200 {
	static char grade;
	char getGrade(int score) {
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80 && score <= 90) {
			grade = 'B';
		} else if (score > 70 && score <= 80) {
			grade = 'C';
		} else if (score > 60 && score <= 70) {
			grade = 'D';
		} else  {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		Student200 obj = new Student200();

		
		System.out.println(obj.getGrade(93));
		
		
	}

}
