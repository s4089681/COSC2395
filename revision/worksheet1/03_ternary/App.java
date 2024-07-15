import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		while (true) {
			System.out.print("Enter an integer, or 0 to exit\n> ");
			in = sc.nextInt();
			if (in == 0) {
				break;
			}
			System.out.print(((in % 2) == 0) ? "Even\n" : "Odd\n");
		}
	}
}
