package com.class33;
import java.util.*;
public class CountryMap {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		countries.put("Tajikistan", "Dushanbe");
		countries.put("Molodova", "Kishinev");
		countries.put("Kazakhstan", "Nursultan");
		countries.put("Azerbaijan", "Baku");
		countries.put("Turkey", "Anakara");
		
		Set<String> set = countries.keySet();
		for(String hset: set) {
			System.out.println(hset + "  " + countries.get(hset));
		}
		System.out.println();
		Iterator<String> itKeys = set.iterator();
		while(itKeys.hasNext()) {
			String name = itKeys.next();
			System.out.println(name +  " " + countries.get(name));
		}
		System.out.println();
		System.out.println("All Capitals");
		Collection<String> capitals = countries.values();
		for(String cap: capitals) {
			System.out.println(cap);
		}
		System.out.println();
		Iterator<String> itValues = capitals.iterator();
		while(itValues.hasNext()) {
			System.out.println(itValues.next());
		}
	}

}
