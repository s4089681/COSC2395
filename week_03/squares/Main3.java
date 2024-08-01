import java.util.*;

public class Main3{
  public static void main(String[] args){
    Square[] squares = new Square[5];
    
    //create the Squares
    for(int i=0;i<squares.length;i++){
      System.out.print("How big is this square #:" + i);
      Scanner input = new Scanner(System.in);
      double side = input.nextDouble();
      squares[i] = new Square(side);
    }
    
    //display the Square data
    for(int i=0;i<squares.length;i++){
      System.out.println("Square #" + i);
      System.out.println("Area: " + squares[i].getArea());
      System.out.println("Perimeter: " + squares[i].getPerimeter());
      System.out.println();
    }
    System.out.println("\n\nHave a nice day\n");
  }
}