public class Cat extends Pet {

	private String hair;

	public Cat() {
	};

	public Cat(String name, int age) {
		super(name, age); // Uses superclass constructor
	};

	public Cat(String name, int age, String hair) {
		super(name, age);
		this.hair = hair;
	};

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getHair() {
		return this.hair;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Hair: " + this.hair;
	}
}
