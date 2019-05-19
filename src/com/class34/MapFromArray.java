package com.class34;
import java.util.*;

public class MapFromArray {
	public static void main(String[] args) {
		String[] names = {"Mehmet", "Denis", "Anar", "Ali"};
		
		Map<Integer, String> nameMap = new LinkedHashMap<>();
		int key = 1;
		for(String name: names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		
	//	Set<Map.Entry<Integer, String>> entry = nameMap.entrySet();
		for(Map.Entry<Integer, String> entry:nameMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		Iterator<Map.Entry<Integer, String>> it = nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry enter = it.next();
			System.out.println(enter.getKey() + " " + enter.getValue() 	);
			
		}
	}

}
