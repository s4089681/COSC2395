import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int in;
        int out = 0;

        System.out.print("Enter an Integer\n>");
        in = Integer.parseInt(sc.nextLine());
        str = Integer.toString(in);
        for (int i = 0; i < str.length(); i++) {
            out += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("Total = " + out);
        sc.close();
    }
}
