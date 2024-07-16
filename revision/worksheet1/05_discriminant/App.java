import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double a, b, c, d, x_1, x_2;

		System.out.println("Quadratic Real Root Calculator");
		System.out.println("ax^2+bx+c=0");
		System.out.print("a = ");
		a = Double.parseDouble(sc.nextLine());
		System.out.print("b = ");
		b = Double.parseDouble(sc.nextLine());
		System.out.print("c = ");
		c = Double.parseDouble(sc.nextLine());

		// Calculate Discriminant
		d = Math.pow(b, 2) - (4 * a * c);

		// If discriminant 0, two identical real roots, if discriminant positive, two
		// real roots, if discriminant negative, two complex roots
		if (d > 0.0) {
			System.out.println("Two differant real roots");
			x_1 = (-b / (2 * a)) + ((1 / (2 * a)) * Math.sqrt(d));
			x_2 = (-b / (2 * a)) - ((1 / (2 * a)) * Math.sqrt(d));
			System.out.println("x_1 = " + x_1 + " x_2 = " + x_2);
		} else if (d < 0.0) {
			System.out.println("Two complex roots");
		} else {
			System.out.println("Two identical real roots");
			// x_1=x_2=-b/2a
			x_1 = x_2 = -b / (2 * a);
			System.out.println("x_1 = " + x_1 + " x_2 = " + x_2);
		}
		sc.close();
	}
}
