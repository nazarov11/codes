package com.class32;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsClass {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(90);
		integerList.add(11);
		integerList.add(9);
		integerList.add(922);
		integerList.add(33);
		
		Collections.sort(integerList);
		System.out.println(integerList);
	}

}
