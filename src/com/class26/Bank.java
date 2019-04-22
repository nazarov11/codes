package com.class26;

public class Bank {
	public void getBalance() {
		System.out.println(0);
	}

}
class BankA extends Bank{
	public void getBalance() {
		System.out.println(1000);
	}
}
class BankB extends Bank{
	public void getBalance() {
		System.out.println(1500);
	}
}
class BankC extends Bank{
	public void getBalance() {
		System.out.println(2000);
	}
}