package MtBullerResort.Customer;

import java.util.ArrayList;

public class Customer {
	private Level level;
	private String name;
	private int id;
	private String phone;
	private String email;
	private String age;

	public static int nextId = 0;

	public Customer() {
		this.id = nextId;
		nextId++;
	}

	public Customer(String name, Level level, String phone, String email, String age) {
		this.name = name;
		this.level = level;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + " | name: " + this.name + " age: " + this.age + " level: " + this.level
				+ " phone: " + this.phone + " email: " + this.email;
	}
}
