package com.class28;

public class Registration1 {
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		if (!email.contains("gmail")) {
			System.out.println("Invalid email type");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		if (userName.length() < 7) {
			System.out.println("UserName must be more than 6 Characters");

		} else if (userName.isEmpty()) {
			System.out.println("User name cannot be empty");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
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
		Registration1 obj = new Registration1();
		obj.setUserName("ali");
		obj.setPassword("ali");
		obj.setEmail("ali");
	}
	
	
	

}
