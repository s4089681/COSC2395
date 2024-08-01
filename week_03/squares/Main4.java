import java.util.*;

public class Main4{
  public static void main(String[] args){
    Random r = new Random();
    Square[] squares = new Square[100];
    
    for(int i=0;i<squares.length;i++){
      double d = r.nextDouble();
      squares[i] = new Square(d*100);
    }
    
    for(int i=0;i<squares.length;i++){
      System.out.printf("%8.2f\n", squares[i].getArea());
    }
    
  }
}