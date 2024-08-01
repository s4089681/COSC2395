/** subclass of Pet class. It can directly use
  * public, protected variables and methods from superclass Pet*/

public class Cat extends Pet{
  //specific variable
  private String hair;
  
  //constructor
  public Cat(){
    super();//optional, provided by default
  }
  public Cat(String name, int age){
    super(name, age);
  }
  public Cat(String name, int age, String hair){
    super(name, age);
    this.hair = hair; //assignment for the specific variable
  }
  //get and set for specific variable
  public String getHair(){
    return hair;
  }
  public void setHairBreed(String hair){
    this.hair = hair;
  }
  @Override
  public void speak(String sound){
    System.out.println("My cat " + name + " always says " + sound);
  }
  public String toString(){
    return super.toString() + "\nHair: " + hair;
  }
}