import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Double a; // Num A
		Double b; // Num B
		char o; // Operator

		// Initialise Scanner
		Scanner sc = new Scanner(System.in);

		// User Input
		System.out.print("Enter first number\n> ");
		a = Double.parseDouble(sc.nextLine());

		System.out.print("Enter operator (+-*/)\n> ");
		o = sc.nextLine().charAt(0);

		System.out.print("Enter second number\n> ");
		b = Double.parseDouble(sc.nextLine());

		System.out.print("\n" + a + " " + o + " " + b + " = ");

		switch (o) {
			case '+':
				System.out.print((a + b) + "\n");
				break;
			case '-':
				System.out.print((a - b) + "\n");
				break;
			case '*':
				System.out.print((a * b) + "\n");
				break;
			case '/':
				System.out.print((a / b) + "\n");
				break;
		}
	}
}
