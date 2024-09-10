package MtBullerResort.Customer;

import java.util.ArrayList;

public class Customer {
	private Level level;
	private String name;
	private int id;

	public static int nextId = 0;

	public Customer() {
		this.id = nextId;
		nextId++;
	}

	public Customer(String name) {
		this();
		this.name = name;
	}

	public Customer(String name, Level level) {
		this(name);
		this.level = level;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Customer ID: " + this.id + " | name: " + this.name + " level: " + this.level;
	}
}
