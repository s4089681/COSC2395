package MtBullerResort.Store.Accomodation;

import MtBullerResort.Store.Purchasable;
import java.io.*;
import java.util.ArrayList;

public class Accomodation implements Purchasable, Serializable {

	private static final long serialVersionUID = 42L; // Implemented as part of serializable interface
	private int nights = 0; // How many nights will the acomodation be?
	private double nightCost; // How much is the accomodation per night?
	private int id; // Integer id used to identify instance of accomodation
	private static int nexId = 0; // Static integer to keep track of next available accomodation ID
	private String location; // Location of the accomodation
	private AccomodationType type; // Used to declare the type of accomodation the instance is

	// Nights count set to 0 by default, if the nights of the accomodation is
	// updated, return appropriate cost of days * price
	@Override
	public double getPrice() {
		if (this.nights == 0) {
			return this.nightCost;
		} else {
			return this.nights * this.nightCost;
		}
	}

	// If a speficifc number of nights is given, return that number * cost
	@Override
	public double getPrice(int multiple) {
		return this.nightCost * multiple;
	}

	// All accomodation will have a cost and a type
	// TODO will the accomodation stay be fixed or variable to customer
	public Accomodation(double nightCost, AccomodationType type) {
		this.nightCost = nightCost;
		this.type = type;
		this.id = nexId;
		nexId++;
	}

	// Allows customer to set x number of nights for stay
	public void setStay(int nights) {
		this.nights = nights;
	}

	// Allow the customer to extend their stay x nights
	public void extendStay(int nights) {
		this.nights += nights;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "id = " + this.id + " Type = " + this.type + " price = " + this.nightCost;
	}

	// Loads all files in directory ./Accomodations/ and attempts to read them into
	// an ArrayList of accomodation
	public static ArrayList<Accomodation> loadAccomodation() {
		ArrayList<Accomodation> accomodationList = new ArrayList<>();
		File[] arr = new File("./Accomodations/").listFiles();
		for (File file : arr) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);

				accomodationList.add((Accomodation) ois.readObject());

				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return accomodationList;
	}

	// Takes an ArrayList of accomodation and saves to individual files based off
	// id, update nextId to highest id + 1
	public static void writeAccomodation(ArrayList<Accomodation> accomodation) {
		try {
			for (Accomodation a : accomodation) {
				String d = System.getProperty("user.dir") + "/MtBullerResort/Store/Accomodation/Accomodations/accomodation"
						+ a.getId() + ".dat"; // Directory of file being saved to
				FileOutputStream fos = new FileOutputStream(d);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				System.out.println("Writing file to: " + d);
				oos.writeObject(a);

				oos.close();
				fos.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
