import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		int len;

		System.out.println("==Menu==");
		System.out.println("1. Print a horizontal line");
		System.out.println("2. Print a vertical line");
		System.out.println("3. Print a triangle");
		System.out.println("4. Exit");
		System.out.print(">");

		in = Integer.parseInt(Character.toString(sc.nextLine().charAt(0)));

		if (in < 1 || in > 4) {
			System.out.println("invalid");
		} else if (in == 4) {
			System.exit(0);
		}

		System.out.println("How long?");
		len = Integer.parseInt(sc.nextLine());
		sc.nextLine();

		switch (in) {
			case 1:
				horizontal(len);
				break;
			case 2:
				vertical(len);
				break;
			case 3:
				triangle(len);
				break;
			default:
				break;
		}
		sc.close();
	}

	public static void horizontal(int len) {
		for (int i = 0; i < len; i++) {
			System.out.print("_");
		}
	}

	public static void vertical(int len) {
		for (int i = 0; i < len; i++) {
			System.out.println("|");
		}
	}

	public static void triangle(int len) {
	}
}
