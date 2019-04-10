package com.class20;



public class Task {
	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
	}
	public static void main(String[] args) {
		Task obj = new Task();
		
		System.out.println(obj.createEmail("Ali", "Nazarov", "gmail"));
		
		
	}

}
