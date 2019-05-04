package com.class28;

import java.util.Scanner;

public class Registration {
	private static String email;
	private static String userName;
	private static String password;

	void email(String email) {
		this.email = email;
		if (!email.contains("gmail")) {
			System.out.println("Invalid email type");
		}
	}

	void userName(String userName) {
		this.userName = userName;
		if (userName.length() < 7) {
			System.out.println("UserName must be more than 6 Characters");

		} else if (userName.isEmpty()) {
			System.out.println("User name cannot be empty");
		}

	}

	void password(String password) {
		this.password = password;
		if (password.length() < 7) {
			System.out.println("Password must be more than 6 Characters");
		}

		if (password.contains(userName)) {
			System.out.println("Password cannot contain username");

		} else if (password.isEmpty()) {
			System.out.println("password cannot be empty");
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true){

			System.out.println("Please provide your Username, Password and Email");

			
			userName = input.nextLine();
			password = input.nextLine();
			email = input.nextLine();
			Registration obj = new Registration();

			obj.userName(userName);

			obj.password(password);
			obj.email(email);
			

			
		} 

	}
}
