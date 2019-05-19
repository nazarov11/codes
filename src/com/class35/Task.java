package com.class35;

import java.util.*;

public class Task {
	
	public static void listOfExceptions() {
		List<Exception> list = new ArrayList<>();
		list.add(new IndexOutOfBoundsException());
		list.add(new InterruptedException());
		list.add(new Exception());
		list.add(new ArithmeticException());
		
		for(Exception e: list) {
			System.out.println(e);
		}
				
	}
	public static void main(String[] args) {
		listOfExceptions();
	}

}
