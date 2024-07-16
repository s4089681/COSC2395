import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in, out;
		String str;
		char[] digit;

		System.out.println("Enter an integer");
		in = Integer.parseInt(sc.nextLine());
		str = Integer.toString(in);

		digit = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			digit[i] = str.charAt(i);
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(digit[i]);
		}
		System.out.print("\n");
	}
}
