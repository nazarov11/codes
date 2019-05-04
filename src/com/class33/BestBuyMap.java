package com.class33;
import java.util.*;

public class BestBuyMap {
	public static void main(String[] args) {
		Map<String, Integer> bestBuy = new LinkedHashMap<>();
		bestBuy.put("Fridge", 1111);
		bestBuy.put("Stove", 1112);
		bestBuy.put("Dishwasher", 1134);
		bestBuy.put("Dryer", 1122);
		bestBuy.put("Toilet", 1345);
		
		for(Map.Entry<String, Integer> entry: bestBuy.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		Iterator<Map.Entry<String, Integer>> it = bestBuy.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry getIt = it.next();
			System.out.println(getIt.getKey() +  " " + getIt.getValue());
		}
	}

}
