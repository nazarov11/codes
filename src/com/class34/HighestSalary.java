package com.class34;

import java.util.*;

public class HighestSalary {
	public static void main(String[] args) {
		Map<String, Integer> salary = new HashMap<>();
		salary.put("John", 100000);
		salary.put("James", 90000);
		salary.put("Jackson", 400000);
		salary.put("Jason", 30000);

		int max = Integer.MIN_VALUE;
		String key = null;
		for (Map.Entry<String, Integer> entry : salary.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				key = entry.getKey();
			}
			
		}
		System.out.println(max + " " + key);

	}

}
