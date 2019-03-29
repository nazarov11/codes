package com.class11;

public class Recap {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "Denchik";
		names[1] = "Anarchik";
		names[2] = "Ali";
		names[3] = "John";
		names[4] = "Jason";
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		String[] studentNames = {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		
		for(int i = 0; i <= studentNames.length-1; i++) {
			
			System.out.println(studentNames[i]);
		}
		
		// advanced for loop, for each loop, enhanced for loop
		
		for(String student : studentNames) {
			System.out.println(student);
		}
	}

}
