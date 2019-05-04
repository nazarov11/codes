package com.class33;
import java.util.*;

public class EntrySet {
	public static void main(String[] args) {
		Map<String, Integer> classRoom = new LinkedHashMap<>();
		classRoom.put("Table", 20);
		classRoom.put("Chairs", 60);
		classRoom.put("Screen", 3);
		classRoom.put("Student", 60);
		classRoom.put("Instructor", 3);
		
		System.out.println(classRoom);
	
		classRoom.entrySet();
		for(Map.Entry<String, Integer> entry: classRoom.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		Iterator<Map.Entry<String, Integer>> it = classRoom.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry iter = it.next();
			System.out.println(iter.getKey() +  " " + iter.getValue());
		}
	}

}
