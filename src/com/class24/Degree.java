package com.class24;

public class Degree {
	void getDegree() {
		System.out.println("I got a degree");

	}

	public static void main(String[] args) {
		Degree obj = new Degree();
		obj.getDegree();
	}

}

class undergraduate extends Degree {
	void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class postgraduate extends Degree {
	void getDegree() {
		System.out.println("I am postgraduate");
	}

}
