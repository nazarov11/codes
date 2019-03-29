package com.class12;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		String userName, password, confirmPassword;

		Scanner input = new Scanner(System.in);
		System.out.println("Please provide a username:");
		userName = input.next();

		System.out.println("Please provide a password:");
		password = input.next();

		System.out.println("Please confirm your password:");
		confirmPassword = input.next();

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or Password cannot be empty");
		}
		if (password.length() < 8) {
			System.out.println("Password is too short");
		}
		if (userName.contains(password) || userName.contains(confirmPassword)) {
			System.out.println("Password can not contain username");
		}
		if(!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}
		if(!userName.isEmpty() && password.length() >= 8 && !userName.contains(password) && password.equals(confirmPassword)) {
			System.out.println("Username and Password has been created");
		}
		

	}

}
