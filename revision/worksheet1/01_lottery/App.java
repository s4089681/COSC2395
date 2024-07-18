import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Initialise and Scanner
        Scanner scan = new Scanner(System.in);

        // Get random 2 digit integer
        int r = (int) Math.floor(Math.random() * 89) + 10;
        int rF = Integer.parseInt(Integer.toString(r).substring(0, 1));
        int rS = Integer.parseInt(Integer.toString(r).substring(1, 2));

        // Get user guess
        System.out.print("Guess a number from 1-99\n> ");
        int g = scan.nextInt();

        int gF = Integer.parseInt(Integer.toString(g).substring(0, 1));
        int gS = Integer.parseInt(Integer.toString(g).substring(1, 2));

        // Compare input and random
        if (Integer.compare(r, g) == 0) {
            System.out.println("Exact match: you win $10000");
        } else if (
            (Integer.compare(rF, gS) == 0) && (Integer.compare(rS, gF) == 0)
        ) {
            System.out.println("Match all digits: you won $3000");
        } else if (
            (Integer.compare(rF, gS) == 0) ||
            (Integer.compare(rS, gF) == 0) ||
            (Integer.compare(rS, gS) == 0) ||
            (Integer.compare(rF, gF) == 0)
        ) {
            System.out.println("Match one digit: you won $1000");
        } else {
            System.out.println("Sorry, no match");
        }
        scan.close();
    }
}
