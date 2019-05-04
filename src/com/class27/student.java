package com.class27;

public class student {
	String name;
	int phone;
	String city;

	student(String name, int phone) {
		this.name = name;
		this.phone = phone;

	}

}

class userInfo extends student {

	userInfo(String name, int phone, String city) {
		super(name, phone);
		this.city = city;
		
	}
	void userDetails() {
		System.out.println(city + " " + name + " " + phone);
	}

}
