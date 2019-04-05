package com.class17;

public class methodAndClass {
	
	//methods and variables are member of the class
		String str;//data members
		int num;
		
		void hello() {
			System.out.println("Hello");
			System.out.println("Hello friends");
			System.out.println("Hello");
			System.out.println("Hello friends");
		}
		
		void bye() {
			System.out.println("Bye");
		}
		
		public static void main(String[] args) {//method signature
			
			methodAndClass obj=new methodAndClass();//method body
			
			obj.hello();//we calling a method hello
			obj.bye();
		}
		
		void howAreYou() {
			System.out.println("How are you?");
		}
	}
	


