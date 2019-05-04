package com.class28;

public abstract class Marks {
	abstract void getPercentage();
	int average;
}

class StudentA extends Marks {
	

	StudentA(int a, int b, int c) {

		average = (a + b + c) / 3;
	}

	@Override
	void getPercentage() {

		System.out.println(average);
	}

}
class StudentB extends Marks {
	StudentB(int a, int b, int c, int d){
		average = (a + b + c + d) / 4; 
	}
	@Override
	void getPercentage() {
		System.out.println(average);
	}
	
}