package com.class13;

public class Task5 {
	public static void main(String[] args) {
		String a = "Is it Saturday? Is it raining? Do we have a java Class today?";
		
		String[] sentences = a.split("\\?");
		System.out.println(sentences.length);
		
	}

}
