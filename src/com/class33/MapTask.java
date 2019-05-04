package com.class33;
import java.util.*;

import com.class22.SyntaxStudent;

public class MapTask {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "CyberTek");
		map.put(4, "Facebook");
		map.put(5, "Uber");
		map.put(6, "Lyft");
		map.put(7, "Chipotle");
		System.out.println(map.size());
		
		map.put(4, "Wegmans");
		map.remove(7);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.entrySet());
		
		//how to get all keys
		Set <Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.print(key +  " ");
		}
		System.out.println();
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			System.out.print(keysIt.next() + " ");
		}
		System.out.println();
		//how to get all values
		Collection <String> valCol = map.values();
		for(String values: valCol) {
			System.out.print(values + " ");
		}	
		System.out.println();
		Iterator<String> itValues = valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next() + " ");
		}
				
	}

}
