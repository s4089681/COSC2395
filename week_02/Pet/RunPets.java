/** Program RunPets.java will run classes Pet and Dog... */

public class RunPets {
	public static void main(String[] args) {
		Pet dog = new Dog("Benjamin", 3, "Husky");
		Pet cat = new Cat("Smudge", 6, "White");

		System.out.println(dog.toString());
		dog.eat("Food");
		dog.speak("Woof");

		System.out.println(cat.toString());
		cat.eat("Food");
		cat.speak("Meow");
	}
}
