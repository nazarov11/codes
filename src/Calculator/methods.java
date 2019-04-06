package Calculator;

public class methods {
	
	public static void main(String[] args) {
		
	}
	 public void menu() {
		System.out.println("Choose one:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
	}
	 public int sum(int a, int b) {
		 
		 return a + b;
	 }
	 public int sub(int a, int b) {
		 return a - b;
	 }
	 public int div(int a, int b) {
		 return a / b;
	 }
	 public int mul(int a, int b) {
		 return a * b;
	 }
}
