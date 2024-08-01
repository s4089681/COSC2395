public class Square{
   //declare instance variable 
   private double length; 
   
   //the constructor
   public Square(double length){
      //assign the argument len to the instance variable length
      this.length = length;
   }
   //methods
   public double getArea(){
     return length*length;
   }
   @Override
   public String toString(){
      return "Square side: " + length + " area: " + getArea(); 
   }
 }

