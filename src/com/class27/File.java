package com.class27;

public abstract class File {
	public void edit() {
		System.out.println("Edit your code anytime");
	}

	public void close() {
		System.out.println("Close by clicking on X");
	}

	public abstract void open();

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open a .java file use Eclipse");

	}

}

class WordFile extends File {
	public void open() {
		System.out.println("To open a .doc file use Microsoft Word");
	}
}

class PDFFile extends File {
	public void open() {
		System.out.println("To open a .pdf file use Adobe Reader");
	}
}