package com.class13;
import java.util.Scanner;
public class Replace {
	public static void main(String[] args) {
		
		String str = "I am good tester!";
		System.out.println(str.replace("a", "e"));
		System.out.println(str.replace("good", "great"));
		System.out.println(str.replace("tester", "programmer"));
		System.out.println(str.replace("Tester", "programmer"));
		
		//2
		String str1 = "12hello 2324 world 4332!%";
		String replaced = str1.replaceAll("[0-9]", "");
		
		System.out.println(replaced);
		System.out.println(replaced.replaceAll("[^A-Za-z]", " "));
		//String noLetter = replaced.replaceAll("[A-Za-z]", "");
		//System.out.println(noLetter);
		
		//3
		String str2 = "1hello123";
		System.out.println(str2.replaceAll("[a-z]", " "));
		
		
	}

}
