/**Class Dog which is a subclass of Pet class
  *program Dog.java in folder Pet
  */
public class Dog extends Pet{
  //it has already name and age
  //specific variable
  private String breed;
  
  //constructors
  public Dog(){
    System.out.println("Subclass constructor is called");
  }
  public Dog(String name, int age){
    //reuse constructor of Pet
    super(name, age);
  }
  //constructor with specific variable
  public Dog(String name, int age, String breed){
    //reuse constructor of Pet
    super(name, age);
    //add assignment to specific variable
    this.breed = breed;
  }
  //get methods, two methods are already here
  public String getBreed(){
    return breed;
  }
 @Override
  public void speak(String sound){
    System.out.println(name + " says " + sound);
  }
  //set methods, two of them are already here
  public void setBreed(String breed){
    this.breed = breed;
  }
  //custom method are inherited
  @Override
  public String toString(){
    return super.toString() + ". Breed " + breed;
  }
}
    