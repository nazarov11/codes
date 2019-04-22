package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {
	public static void main(String[] args) {
		WaterFallTeam wt = new WaterFallTeam();
		
		wt.salary1 = 90000;// can access protected values from different package through inheritance
		//default values cannot be accessed in different package
		//Multiple inheritance is not available through the classes
		
	}

}
