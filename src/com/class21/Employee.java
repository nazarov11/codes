package com.class21;

public class Employee {
	String eID;
	int salary;
	static String CEO = "Sumair";
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eID = "Ali Nazarov";
		emp1.salary = 100000;
		
		
		Employee emp2 = new Employee();
		emp2.eID = "Denis Ivancioglu";
		emp2.salary = 10;
		
		System.out.println(emp1.eID + " $" + emp1.salary + " " + CEO);
		System.out.println(emp2.eID + " $" + emp2.salary + " " + CEO);

		
	}

}
