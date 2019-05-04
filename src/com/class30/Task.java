package com.class30;

import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Denis");
		names.add("Anar");
		names.add("Ali");
		names.add("John");
		names.add("Jake");
	
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Denis"));
		System.out.println(names.size());
		
		for(String allNames: names) {
			System.out.println(allNames);
		}
	}

}
