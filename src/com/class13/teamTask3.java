package com.class13;

public class teamTask3 {
	public static void main(String[] args) {
		
		String anything = "adf231%4@sfsf!#sdf";
		String remove = anything.replaceAll("[a-z0-9]", "");
		System.out.println(remove);
		System.out.println(remove.length());
		
	}

}
