package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jane");
		list.add("James");
		list.add("Jasmine");
		list.add("Jane");
		list.add("James");
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);		
		
		
		
		
	}

}
