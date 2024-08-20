package MtBullerResort.Customer;

import java.util.ArrayList;

import MtBullerResort.Store.Price;

public class Customer {
	private Level level;
	private String name;
	private int id;

	private ArrayList<Price> ;

	static int nextId = 1;

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
}
