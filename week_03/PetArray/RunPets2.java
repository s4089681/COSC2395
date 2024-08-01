public class RunPets2{
  public static void main(String[] args){
    int count = 0;
    //create instance of Dog
    Dog dog1 = new Dog("Korr", 5,"buldog");
    count++;
    //another instance of Dog 
    Dog dog2 = new Dog("Chama", 6, "german shepherd");
    count++;
    //create an instance of Cat
    Cat cat1 = new Cat("Juliette", 3, "short");
    count++;
    Cat cat2 = new Cat("Murka", 12, "short");
    count++;
    //________________________________________________ 
    //create array of type of Pet
     Pet[] pets = new Pet[5];     //array object points null objects locations
     //assign instances to elements of array
     pets[0] = dog1;
     pets[1] = dog2;
     //you can assign to pets Pet, Dog, and Cat. Dog is a Pet, and Cat is a Pet
     pets[2] = cat1;
      
      //display all pets, do not display nulls
      System.out.println("----------------------");
      for(int i = 0; i < count; i++){
       System.out.println(pets[i]);
     }  
      System.out.println("My dogs are:");
      //display only dogs
       for(int i = 0; i < count; i++){
        if(pets[i] instanceof Dog)
        System.out.println(pets[i]);
     }  
       System.out.println("My cats are:");
       //display only cats
       for(int i = 0; i < count; i++){
        if(pets[i] instanceof Cat)
        System.out.println(pets[i]);
     }   
      System.out.println("Number of pets " + count);
     
     
     
     
     
     
     
     
  }
}