package MtBullerResort;

import MtBullerResort.Store.Accomodation.Accomodation;
import MtBullerResort.Store.Accomodation.AccomodationType;
import MtBullerResort.Store.TravelPackage.TravelPackage;
import MtBullerResort.Customer.*;

import java.util.ArrayList;

public class MtBullerResort {
	private ArrayList<TravelPackage> packages;
	private ArrayList<Customer> customers;
	private ArrayList<Accomodation> accomodation; // Contains all avilable accomodations

	// public fn loadAccomodation
	// public fn loadPackages
	// public fn loadCustomers
	public static void main(String[] args) {

		ArrayList<Accomodation> a = new ArrayList<>();
		a.add(new Accomodation(1.0, AccomodationType.APARTMENT));
		a.add(new Accomodation(2.0, AccomodationType.HOTEL));
		Accomodation.writeAccomodation(a);
	}

}
