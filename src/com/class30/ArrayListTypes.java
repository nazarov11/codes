package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {
	public static void main(String[] args) {
		//generic array that stores only String Object
		ArrayList<String> names = new ArrayList<String>();
		names.add("Denis");
		names.add("Anar");
		names.add("Ali");
		names.add("John");
		names.add("Jake");
		names.remove(2);
		names.clear();
		//non - generic arraylist, can have any types of values
		ArrayList alist = new ArrayList();
		alist.add(123);
		alist.add("Java");
		alist.add(true);
		
		for(Object values: alist) {
			System.out.println(values);
		}
	}

}
