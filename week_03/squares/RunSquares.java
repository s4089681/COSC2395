import java.util.*;

public class RunSquares{
  public static void main(String[] args){
    //declare and create array of type Square
    Square[] squares = new Square[3];
   //create array elements
     squares[0] = new Square(2.4);
     squares[1] = new Square(23.1);
     squares[2] = new Square(3.5);

    //display the Squares data in for loop
    for(int i=0;i<squares.length;i++){
      System.out.println( squares[i].toString() );
    }
}
}