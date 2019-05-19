package com.class34;

import java.util.*;
import java.util.Map.Entry;

public class MapReview {
	public static void main(String[] args) {
		Map<String, Integer> products = new LinkedHashMap<>();
		products.put("Milk", 1);
		products.put("Bread", 2);
		products.put("Eggs", 12);
		products.put("Coffee", 2);
		products.put("Potato", 2);
		products.put("Cookies", 3);
		// System.out.println(products);
		
		products.put("Cheese", 1);
		// System.out.println(products.size());
		
		products.replace("Eggs", 18);
		// System.out.println(products);
		products.remove("Cheese");
		// System.out.println(products);
		
		Set<String> keySet = products.keySet();
		for (String key : keySet) {
			System.out.println(key + " " + products.get(key));
		}
		System.out.println();
		Iterator<String> it = products.keySet().iterator();
		while (it.hasNext()) {
			String keys = it.next();
			System.out.println(keys + " " + products.get(keys));
		}

		Collection<Integer> valCol = products.values();
		for (Integer values : valCol) {
			System.out.println(values);
		}
		Iterator<Integer> it1 = products.values().iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		for (Map.Entry<String, Integer> entry : products.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		Iterator<Map.Entry<String, Integer>> iter = products.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry getIt = iter.next();
			System.out.println(getIt.getKey() + " " + getIt.getValue());
		}

	}

}
