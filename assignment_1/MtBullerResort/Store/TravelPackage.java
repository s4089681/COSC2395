package MtBullerResort.Store;

import MtBullerResort.Customer.Level;
import java.util.ArrayList;

public class TravelPackage {
	private Level level; // Level of lessons / lift pass associated with package
	private ArrayList<Purchasable> items; // Items within the package contained in an ArrayList

	// A package wont always have a level as a package may not contain a lesson or a
	// lift pass, however it will always contain accomodation
	public TravelPackage(ArrayList<Purchasable> items, Level level) {
		this(items);
		this.level = level;
	}

	public TravelPackage(ArrayList<Purchasable> items) {
		// Does logic to ensure that the items contain Accomodation
		// Lift pass and lessons are optional
		Boolean containAccomodation = false;
		for (Purchasable item : items) {
			// Loops through all items given, if an item is accomodation break loop and
			// allow items to be passed
			if (item.getClass().getName().equals("Accomodation")) {
				containAccomodation = true;
				break;
			}
		}
		if (!containAccomodation) {
			throw new Error("No accomodation in travel package");
		} else {
			this.items = items;
		}
	}
}
