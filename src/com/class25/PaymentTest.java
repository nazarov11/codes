package com.class25;

public class PaymentTest {
	public static void main(String[] args) {
		Payment parent = new masterCard();
		parent.makePayment();
		
		masterCard mc = new masterCard();
		mc.makePayment();
		Visa visa = new Visa();
		visa.annualFee();
		visa.makePayment();
		
		// achieving run time polymorphism
		//upcasting
		Payment pay = new masterCard();
		pay.closePayment();
		pay.makePayment();
		
		
	}

}
