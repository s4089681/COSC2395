package MtBullerResort;

import MtBullerResort.Store.Accomodation.Accomodation;
import MtBullerResort.Store.Accomodation.AccomodationType;
import MtBullerResort.Store.TravelPackage.TravelPackage;
import MtBullerResort.Customer.*;

import java.util.ArrayList;

public class MtBullerResort {
	private ArrayList<TravelPackage> packages = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Accomodation> accomodation = new ArrayList<>(); // Contains all avilable accomodations

	// public fn loadAccomodation
	// public fn loadPackages
	// public fn loadCustomers
	// public static void main(String[] args) {
	//
	// ArrayList<Accomodation> a = new ArrayList<>();
	// a.add(new Accomodation(1.0, AccomodationType.APARTMENT));
	// a.add(new Accomodation(2.0, AccomodationType.HOTEL));
	// Accomodation.writeAccomodation(a);
	// }

	// Adds a customer to the MtBullerResort customer ArrayList, returns the ID of
	// that customer

	public MtBullerResort() {
	}

	public void addCustomer(String name, Level level) {
		this.customers.add(new Customer(name, level));
	}

	// Iterates over Customer arraylist, callin toString of each entry
	public void listCustomers() {
		for (Customer c : this.customers) {
			System.out.println(c.toString());
		}
	}
}
