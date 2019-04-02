package com.class13;

public class Task4 {
	
	public static void main(String[] args) {
		String whatever = "ad adfw $%4 @ $% sda";
		String noLetters = whatever.replaceAll("[A-za-z]", "");
		
		System.out.println(noLetters.replaceAll("[0-9]", ""));
	}

}
