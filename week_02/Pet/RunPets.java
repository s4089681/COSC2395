/** Program RunPets.java will run classes Pet and Dog...*/

public class RunPets{
  public static void main(String[] args){
    //Create a Pet
    Pet pet = new Pet();
    //test methods
    pet.speak("Hi");
    //Create a Dog
    Dog dog4 = new Dog();
    Dog dog1 = new Dog("Chama", 9);
    //display
    System.out.println(dog1);
    //set breed
    dog1.setBreed("german shepherd");
    //display again
    System.out.println(dog1);
    dog1.speak("Woof");
    //create Dog as a Pet
    Pet dog3 = new Dog("Tez", 12, "buldog");
    //display
    System.out.println(dog3);
    dog3.speak("Woof,woof");
    
  }
}