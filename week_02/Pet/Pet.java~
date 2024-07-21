/**superclass describing common features of pets
 */

public class Pet{
  /**
   * instance variables
   * they are protected so can used by subclasses*/
  
  protected String name;
  protected int age;
  
  //constructor without parameters (null) 
  public Pet(){
    System.out.println("Superclass constructor is called");
  }
  //constructor with parameters
  public Pet(String name, int age){
    this.name = name;
    this.age = age;
  }
  //get methods
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  //set methods
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  //custom methods
  public void speak(String sound){
    System.out.println(sound);
  }
  public void eat(String food){
    System.out.println("Pet loves " + food);
  }
  public String toString(){
    return "I have a pet " + name + " of " + age + " years old";
  }
}
  
  