package com.class32;

import java.util.ArrayList;

public class InsuranceTest {
	public static void main(String[] args) {
		
		Car obj = new Car("geico");
		Pet obj1 = new Pet("nation wide");
		Health obj2 = new Health("Cigna");
		
		ArrayList<Insurance> alist = new ArrayList<>();
		alist.add(obj);
		alist.add(obj1);
		alist.add(obj2);
		for(Insurance ins: alist) {
			System.out.println(ins.insuranceName);
			ins.getQuote();
			ins.cancelInsurance();
		}
	}

}
