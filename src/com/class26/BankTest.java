package com.class26;

public class BankTest {
	public static void main(String[] args) {
		Bank balance = new BankA();
		balance.getBalance();
		
		Bank balance1 = new BankB();
		balance1.getBalance();
		
		Bank balance2 = new BankC();
		balance2.getBalance();
	}

}
