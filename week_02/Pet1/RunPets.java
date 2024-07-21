/** Program RunPets.java will run classes Pet and Dog...*/

public class RunPets{
  public static void main(String[] args){
    //Create a Pet
    Pet pet = new Pet();
    //test methods
    pet.speak("Hi");
    pet.eat("anything");
    //Create a Dog
    Dog dog1 = new Dog("Chama", 9);
    //display
    System.out.println(dog1);
    //set breed
    dog1.setBreed("german shephard");
    //display again
    System.out.println(dog1);
    dog1.speak("woof, woof");
    //create Dog as a Pet
    Pet dog2 = new Dog("Tez", 12, "buldog");
    //display
    System.out.println(dog2);
    
    
  }
}