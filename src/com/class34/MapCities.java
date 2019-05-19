package com.class34;

import java.util.*;

public class MapCities {
	public static void main(String[] args) {
		String[] cities = { "Moscow", "Dushanbe", "Nursultan", "Washington" };

		Map<String, Integer> city = new TreeMap<>();
		int num = 1;
		for (String towns : cities) {
			city.put(towns, num);
			num++;

		}
		System.out.println(city);

		Iterator<Map.Entry<String, Integer>> it = city.entrySet().iterator();
		while (it.hasNext()) {
			if (it.next().getKey().length() > 7) {
				it.remove();

			}

		}
		System.out.println(city);
	}

}
