package TaskConstructor;

public class taskConstructor2 {
	public static String studentName;

	public void avGrade(int gr1, int gr2, int gr3) {

		int averageGrade = (gr1 + gr2 + gr3) / 3;
		System.out.println("Average Grade for " + taskConstructor2.studentName + " is " 
				+ averageGrade);
	}

	taskConstructor2(String name) {
		studentName = name;
		
	}

}
