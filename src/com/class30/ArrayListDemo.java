package com.class30;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList <String> greetings = new ArrayList<String>();
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("hi");
		greetings.add("Bye");
		
		System.out.println(greetings.get(1));
		System.out.println(greetings.size());
		//collections - growable in size
		greetings.add("how are you");
		greetings.add("how are you");
		greetings.add("how are you");
		
		for(int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		for(String greetWords: greetings) {
			System.out.println(greetWords);
		}
	}

}
