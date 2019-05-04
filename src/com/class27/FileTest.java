package com.class27;

public class FileTest {
	public static void main(String[] args) {
		File java = new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		System.out.println();
		File word = new WordFile();
		word.open();
		word.edit();
		word.close();
		
		System.out.println();
		File pdf = new PDFFile();
		pdf.open();
		pdf.edit();
		pdf.close();
	}

}
