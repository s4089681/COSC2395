// Iterate from 0 to 360 degrees in 10 degree increments, printing θ, sinθ cosθ

public class App {
	public static void main(String[] args) {
		System.out.printf("%-9s%-9s%-9s\n", "Degree", "Sin", "Cos");
		for (int i = 0; i <= 360; i += 10) {
		System.out.printf("%-9d%-9.4f%-9.4f\n", i, Math.sin(Math.toRadians(i)), Math.cos(Math.toRadians(i)));
		}
	}
}
