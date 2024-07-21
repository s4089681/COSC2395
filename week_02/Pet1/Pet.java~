/**Class Pet which will be superclass for Dog and Cat
  *program Pet.java, folder Pet1
  */

public class Pet{
  /*instance variables
   *with protected access to be inherited by subclasses
   */
  protected String name;
  protected int age;
  
  /*constructors*/
  public Pet(){
    System.out.println("Superclass constructor is called");
  }
  public Pet(String name, int age){
    this.name = name;
    this.age = age;
    System.out.println("Superclass constructor is called");
  }
  /*get or accessor methods*/
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  /*set or mutator methods*/
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  @Override
  public String toString(){
    return name + " is of " + age + " years old";
  }
  //custom methods
  public void speak(String sound){
    System.out.println(sound);
  }
  public void eat(String food){
    System.out.println("My pet loves " + food);
  }
}

    