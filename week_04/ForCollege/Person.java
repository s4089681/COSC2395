public class Person {
	protected String id;
	protected String name;

	public Person() {
	}

	public Person(String id, String theName) {
		name = theName;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String toString() {
		return id + " " + name;
	}

}
