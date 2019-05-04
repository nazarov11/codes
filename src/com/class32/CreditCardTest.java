package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {
	public static void main(String[] args) {
		Visa visa = new Visa("Visa Platinum");
				
		AX ax = new AX("AX rewards");
		
		MasterCard mc = new MasterCard("MC Basic");
		
		ArrayList<CreditCard> alist = new ArrayList<>();
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);
		
//		for(CreditCard card: alist) {
//			System.out.println(card.creditCardName);
//			card.interestRate();
//			card.annualFee();
//		}
		
//		Iterator<CreditCard> it = alist.iterator();
//		while(it.hasNext()) {
//			CreditCard obj = it.next();
//			System.out.println(obj.creditCardName);
//			obj.annualFee();
//			obj.interestRate();
//		}
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i).creditCardName);
			alist.get(i).annualFee();
			alist.get(i).interestRate();
		}
	}

}
