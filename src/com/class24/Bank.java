package com.class24;

public class Bank {
	public int interest() {
		return 0;
	}

}
class BOA extends Bank{
	public int interest() {
		return 2;
	}
}
class PNC extends Bank{
	public int interest() {
		return 3;
		
	}
	void m() {
		System.out.println("Java");
	}
}