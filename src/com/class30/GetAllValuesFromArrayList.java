package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Denis");
		names.add("Anar");
		names.add("Ali");
		names.add("John");
		names.add("Jake");

		// 1 way using for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// 2 way using advanced loop
		for (Object n : names) {
			System.out.println(n);
		}
		// 3 way using iterator
		System.out.println();
		Iterator<String> it = names.iterator();
//		boolean check = it.hasNext();
//		System.out.println(check);
		while (it.hasNext()) {

 			System.out.println(it.next());

		}
	}

}
