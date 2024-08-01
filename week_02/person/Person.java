public class Person {
	private String name;
	private String address;
	private String email;
	private String phone;

	public Person() {
	};

	public Person(String name) {
		this.name = name;
	};

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	};

	public Person(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	};

	public Person(String name, String address, String email, String phone) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	};
}
