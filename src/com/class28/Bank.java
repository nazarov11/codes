package com.class28;

public interface Bank {

	String name = "Bank"; // by default all variables inside the interface are
							// public static and final

	void hasChecking();

	void hasSavings();

	void hasCreditCard();

}

class BOA implements Bank {
	BOA(){
		System.out.println("BOA");
	}

	@Override
	public void hasChecking() {
		System.out.println("BOA checking accounts");

	}

	@Override
	public void hasSavings() {
		System.out.println("BOA savings account");

	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA Credit cards");

	}

}

class PNC implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("PNC checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC Credit cards");
	}

}
