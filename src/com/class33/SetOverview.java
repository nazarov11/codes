package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetOverview {
	public static void main(String[] args) {
		Set<String> classDays = new TreeSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		
//		for(String days: classDays) {
//			System.out.println(days);
//		}
		Iterator<String> it = classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
