import java.util.*;

public class Main2{
  public static void main(String[] args){
    //user Scanner to get user input for length of side
    Scanner input = new Scanner(System.in);
    double length = input.nextDouble();
    
    //create a Square using the user input
    Square sq1 = new Square(length);
    
    //print out the area and perimeter of the Square
    System.out.println(sq1.getArea());
    //System.out.println(sq1.getPerimeter());
  }
}