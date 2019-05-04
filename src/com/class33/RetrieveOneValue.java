package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValue {
	public static void main(String[] args) {
		Set<String> cars = new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Jeep");
		cars.add("Mercedes");
		
		//1 way to convert to the ArrayList
		List<String> list = new ArrayList<>(cars);
		System.out.println("List collection " + list);
		System.out.println(list.get(2));
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(cars);
		System.out.println(list2);
		
		// 2 way convert to array
		Object[] array = cars.toArray();
		System.out.println(array[1]);
		
		
		
		
		
	}

}
