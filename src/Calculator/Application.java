package Calculator;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		methods calc = new methods();

		boolean startOver = true;
		while (startOver) {

			calc.menu();
			Scanner input = new Scanner(System.in);
			int a;
			int number1;
			int number2;

			a = input.nextInt();
			if (a == 1) {
				System.out.println("Enter your numbers");
				number1 = input.nextInt();
				number2 = input.nextInt();

				System.out.println(calc.sum(number1, number2));
			} else if (a == 2) {
				System.out.println("Enter your numbers");
				number1 = input.nextInt();
				number2 = input.nextInt();
				System.out.println(calc.sub(number1, number2));
			} else if (a == 3) {
				System.out.println("Enter your numbers");
				number1 = input.nextInt();
				number2 = input.nextInt();
				System.out.println(calc.div(number1, number2));
			} else if (a == 4) {
				System.out.println("Enter your numbers");
				number1 = input.nextInt();
				number2 = input.nextInt();
				System.out.println(calc.mul(number1, number2));
			} else if (a > 4) {
				System.out.println("Invalid choice");
			} else {
				startOver = false;
			}
		}
	}

}
