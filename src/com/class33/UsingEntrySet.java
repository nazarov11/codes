package com.class33;
import java.util.*;
public class UsingEntrySet {
	public static void main(String[] args) {
		Map<String, String> userDetailsMap = new LinkedHashMap<>();
		userDetailsMap.put("Name", "Alex Smith");
		userDetailsMap.put("Salary", "90000");
		userDetailsMap.put("Department", "IT");
		userDetailsMap.put("Title", "Automation Tester");
		//System.out.println(userDetailsMap);
		
		userDetailsMap.entrySet();
		for(Map.Entry<String, String> entry: userDetailsMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		Iterator<Map.Entry<String, String>> it = userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = it.next();
			System.out.println(entry.getKey() +  " " + entry.getValue());
		}
		
	}

}
