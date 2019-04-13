package com.class22;

public class child1 extends ParentInheritance{
	
	int age = 2;
	public static void main(String[] args) {
		child1 obj1 = new child1();
		obj1.sing();
		System.out.println(obj1.eyeColor);
		System.out.println(obj1.hairColor);
		System.out.println(obj1.nose);
		
		ParentInheritance parentObject = new ParentInheritance();
		//parentObject.age is not available
		
	}

}
