package com.class24;

public class Employee {
	void getPaid() { // Overridden method
		System.out.println("We get paid");
	}
	void vacation() {
		System.out.println("Vacation");
	}
	
	public static void main(String[] args) {
		//type casting
		Employee obj = new Contractor();
		obj.getPaid();
		obj.vacation();
//		Contractor obj1 = new Contractor();
//		obj1.getPaid();
		
	}
}
