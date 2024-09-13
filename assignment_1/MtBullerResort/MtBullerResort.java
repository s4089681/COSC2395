package MtBullerResort;

import MtBullerResort.Store.Accomodation.Accomodation;
import MtBullerResort.Store.Accomodation.AccomodationType;
import MtBullerResort.Store.TravelPackage.TravelPackage;
import MtBullerResort.Customer.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

	public static void clear() {
		System.out.println("\033c"); // ANSI escape code to clear console
	}

	public void addCustomer() {
		Scanner sc = new Scanner(System.in);
		String name, phone, email, age;
		Level level = Level.BEGINNER;
		System.out.println("\n----- Add Customer -----\n");
		System.out.print("Customers Name > ");
		name = sc.nextLine();
		System.out.print("Customers Skill Level (beginner / intermediate / expert) > ");
		switch (sc.nextLine().toLowerCase()) {
			case "beginner":
				level = Level.BEGINNER;
				break;
			case "intermediate":
				level = Level.INTERMEDIATE;
				break;
			case "expert":
				level = Level.EXPERT;
				break;
			default:
				System.out.println("Unknown level");
				break;
		}
		System.out.print("Customers Phone Number > ");
		phone = sc.nextLine();
		System.out.print("Customers Age (DD/MM/YYYY) > ");
		age = sc.nextLine();
		System.out.print("Customers Email Address > ");
		email = sc.nextLine();

		customers.add(new Customer(name, level, phone, email, age));

		System.out.println("\nCustomer Added!");

		entCont();
	}

	// Iterates over Customer arraylist, callin toString of each entry
	public void listCustomers() {
		clear();
		System.out.println("\n----- Customer List -----\n");
		for (Customer c : this.customers) {
			System.out.println(c.toString());
		}

		entCont();
	}

	// Main menu class to be ran by Admin
	public void menu() {
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			clear();

			System.out.println(" __  __ _   ____        _ _              _____ _    _   _____                      _   ");
			System.out.println("|  \\/  | | |  _ \\      | | |            / ____| |  (_) |  __ \\                    | |  ");
			System.out.println("| \\  / | |_| |_) |_   _| | | ___ _ __  | (___ | | ___  | |__) |___  ___  ___  _ __| |_ ");
			System.out
					.println("| |\\/| | __|  _ <| | | | | |/ _ \\ '__|  \\___ \\| |/ / | |  _  // _ \\/ __|/ _ \\| '__| __|");
			System.out.println("| |  | | |_| |_) | |_| | | |  __/ |     ____) |   <| | | | \\ \\  __/\\__ \\ (_) | |  | |_ ");
			System.out.println(
					"|_|  |_|\\__|____/ \\__,_|_|_|\\___|_|    |_____/|_|\\_\\_| |_|  \\_\\___||___/\\___/|_|   \\__|\n");

			// Print Menu Options

			// Seperate menu into layers
			// Customers
			// Packages
			// Accomodation

			System.out.println("(0) Packages");
			System.out.println("(1) Customers");
			System.out.println("(2) Accomodation");

			System.out.println();

			// Load / Save all pacakges / accomodation / customers to files
			System.out.println("(s) Save All");
			System.out.println("(l) Load All");

			System.out.println();
			System.out.println("(e) Exit");
			System.out.print("\n> ");

			// Get first character of user input
			switch (scan.next().toLowerCase().charAt(0)) {
				case '0': // Packages Sub Menu
					packageMenu();
					break;
				case '1': // Customer Sub Menu
					customerMenu();
					break;
				case '2': // Accomodation Sub Menu
					accomodationMenu();
					break;
				case 's': // Saves all items to binary files
					break;
				case 'l': // Loads all binary files
					break;
				case 'e':
					// break loop;
				default:
					break;
			}
		}
	}

	// Helper function to prompt enter any key to continue
	public void entCont() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nAny Key + Enter to continue");
		System.out.print("\n> ");
		scan.next();

	}

	public void listPackage() {
		clear();
		System.out.println("----- List Packages -----\n");
		// Catches if no packages are found
		if (packages.isEmpty()) {
			System.out.println("\nNo Packages to Display!\n");
		} else {
			for (TravelPackage p : packages) {
				p.toString();
			}
		}
		entCont();

	}

	public void packageMenu() {
		Scanner scan = new Scanner(System.in);
		clear();
		System.out.println("\n----- Packages -----\n");
		System.out.println("(0) List Packages");
		System.out.println("(1) Create Package");

		System.out.println("(2) Add Lift Pass to Package");
		System.out.println("(3) Add Lesson to Package");
		System.out.println();
		System.out.println("(s) Save Packages");
		System.out.println("(l) Load Packages");
		System.out.print("\n> ");

		switch (scan.next().toLowerCase().charAt(0)) {
			case '0': // List Packages
				listPackage();
				break;
			case '1': // create package
				createPackage();
				break;
			case '2':

				break;
			case '3':

				break;

			default:
				break;
		}
	}

	public void savePackage() {
		clear();
		TravelPackage.writeTravelPackage(packages);
		entCont();
	}

	public void loadPackage() {
		clear();
		for (TravelPackage p : packages) {
			packages.add(p);
		}
		entCont();
	}

	public void customerMenu() {
		Scanner scan = new Scanner(System.in);
		clear();
		System.out.println("----- Customers -----\n");
		System.out.println("(0) Add Customer");
		System.out.println("(1) List Customers");
		System.out.println();
		System.out.println("(e) Exit");

		System.out.print("\n> ");

		switch (scan.next().toLowerCase().charAt(0)) {
			case '0':
				addCustomer();
				break;
			case '1':
				listCustomers();
				break;
			case 'e':
				break;
			default:
				break;

		}
	}

	public void accomodationMenu() {
		Scanner scan = new Scanner(System.in);
		clear();
		System.out.println("----- Customers -----\n");
		System.out.println("(0) List All Accomodation");
		System.out.println("(1) List Available Accomodation");
		System.out.println("(2) Add Accomodation");
		System.out.println("(3) Save Accomodation");
		System.out.println("(4) Load Accomodation");

		System.out.println();
		System.out.println("(e) Exit");

		System.out.print("\n> ");

		switch (scan.next().toLowerCase().charAt(0)) {
			case '0':
				listAccomodation();
				break;
			case '1':
				listAvailableAccomodation();
				break;
			case '2':
				addAccomodation();
				break;
			case '3':
				saveAccomodation();
				break;
			case '4':
				loadAccomodation();
				break;
			case 'e':
				break;
			default:
				break;

		}
	}

	public void listAccomodation() {
		clear();
		System.out.println("\n----- Accomodation List -----\n");

		// Catches if accomodation empty
		if (accomodation.isEmpty()) {
			System.out.println("There are no accomodations in the system!");
			entCont();
			return;
		}

		// Loops over all accomodation and prints to string
		for (Accomodation a : accomodation) {
			System.out.println(a.toString());
		}

		entCont();
	}

	public void listAvailableAccomodation() {
		clear();
		System.out.println("\n----- Accomodation List -----\n");

		// Catches if accomodation empty
		if (accomodation.isEmpty()) {
			System.out.println("There are no accomodations in the system!");
			entCont();
			return;
		}

		// Loops over all accomodation
		for (Accomodation a : accomodation) {
			if (a.available()) { // If the accomodation is available, print out
				System.out.println(a.toString());
			}
		}

		entCont();
	}

	public void addAccomodation() {
		clear();
		System.out.println("\n----- Add Accomodation -----\n");

		Scanner scan = new Scanner(System.in);

		AccomodationType type = AccomodationType.LODGE;
		double nightCost = 0;
		String location;

		System.out.print("Accomodation Type > ");
		switch (scan.nextLine().toLowerCase()) {
			case "hotel":
				type = AccomodationType.HOTEL;
				break;
			case "lodge":
				type = AccomodationType.LODGE;
				break;
			case "apartment":
				type = AccomodationType.APARTMENT;
				break;
			case "cabbin":
				type = AccomodationType.CABIN;
				break;
			default:
				System.out.println("Unknown Accomodation Type");
				break;
		}

		String input;

		do {
			System.out.print("Per Night Cost > ");
			input = scan.nextLine();
			nightCost = Double.parseDouble(input);
			if (!isNumeric(input)) {
				System.out.println("Not a numeric input");
			}

		} while (!isNumeric(input));

		System.out.print("Accomodation Location > ");
		location = scan.nextLine();

		accomodation.add(new Accomodation(nightCost, type, location));
	}

	public void saveAccomodation() {
		clear();
		System.out.println("\n----- Saving Accomodation -----\n");
		Accomodation.writeAccomodation(accomodation);
		entCont();
	}

	public void loadAccomodation() {
		clear();
		System.out.println("\n----- Loading Accomodation -----");

		for (Accomodation a : Accomodation.loadAccomodation()) {
			accomodation.add(a);
		}

		entCont();
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public void createPackage() {
		clear();
		// To create a pacakge we need;
		// Date Range
		// Customer ID
		// Associated Accomodation either listed by ID, price, or type
		// accomodation by given ID
		//
		// Then add to ArrayList of packages
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date start = new Date();
		Date end = new Date();
		Accomodation packageAccomodation;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n----- Create Package -----");
		System.out.println("-- Choose Date --\n");

		// Block to catch invalid date ranges
		boolean valid = false;
		do {
			System.out.print("Starting date? (dd/mm/yyyy) > ");
			try {
				start = sdf.parse(scan.nextLine());
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.print("Ending date? (dd/mm/yyyy) > ");
			try {
				end = sdf.parse(scan.nextLine());
			} catch (Exception e) {
				System.out.println(e);
			}

			// If the end after start, valid date range, exit loop
			if (!start.after(end)) {
				valid = true;
				break;
			}
			System.out.println("\nInvalid Date, duration cannot be negative\n");
		} while (!valid);

		clear();

		int startIndex = 0;
		int finishIndex = 9;
		int y = 0;

		System.out.println("----- Create Package -----");
		System.out.println("-- Choose Accomodation --\n");
		System.out.println(sdf.format(start) + " - " + sdf.format(end) + " "
				+ TimeUnit.MILLISECONDS.toDays(end.getTime() - start.getTime()) + " days\n");

		// Catches if accomodation empty
		if (accomodation.isEmpty()) {
			System.out.println("No Valid Accomodation");
			entCont();
			return;
		}

		// Creates a buffer arraylist of only available accomodation which can be sorted
		Map<Integer, Accomodation> buffer = new HashMap<>();
		for (Accomodation a : accomodation) {
			if (a.available()) {
				buffer.put(a.getId(), a);
			}
		}

		// Sorts available accomodation by price
		List<Accomodation> accomodationByPrice = new ArrayList<>(buffer.values());
		Collections.sort(accomodationByPrice, Comparator.comparing(Accomodation::getPrice));

		// Sorts available accomodation by id
		List<Accomodation> accomodationById = new ArrayList<>(buffer.values());
		Collections.sort(accomodationById, Comparator.comparing(Accomodation::getId));

		// Prints out all accomodation first by id
		try {
			for (int i = startIndex; i <= finishIndex; i++) {
				System.out.println("(" + y + ") " + buffer.get(i).toString());
				y++;
			}
		} catch (Exception e) {
			// Loops over accomodation until its empty, will eventually hit out of bounds
		}

		accomodationLoop: while (true) {
			// Loops over input allowing for user to interact

			System.out.println();
			System.out.println("(s) Sort By ID");
			System.out.println("(c) Sort By Price");
			System.out.println("(i) Select By ID");
			System.out.println();
			System.out.println("(n) Next Page");
			System.out.println("(p) Previous Page");

			System.out.print("\n> ");

			switch (scan.nextLine().toLowerCase().charAt(0)) {
				case 's': // Print by id
					clear();
					System.out.println("----- Create Package -----");
					System.out.println("-- Choose Accomodation --\n");
					System.out.println(sdf.format(start) + " - " + sdf.format(end) + " "
							+ TimeUnit.MILLISECONDS.toDays(end.getTime() - start.getTime()) + " days\n");

					try {
						y = 0;
						for (int i = startIndex; i <= finishIndex; i++) {
							System.out.println("(" + y + ") " + accomodationById.get(i).toString());
							y++;
						}
					} catch (Exception e) {
						// Loops over accomodation until its empty, will eventually hit out of bounds
					}
					break;
				case 'c': // Print by Price
					clear();
					System.out.println("----- Create Package -----");
					System.out.println("-- Choose Accomodation --\n");
					System.out.println(sdf.format(start) + " - " + sdf.format(end) + " "
							+ TimeUnit.MILLISECONDS.toDays(end.getTime() - start.getTime()) + " days\n");

					try {
						y = 0;
						for (int i = startIndex; i <= finishIndex; i++) {
							System.out.println("(" + y + ") " + accomodationByPrice.get(i).toString());
							y++;
						}
					} catch (Exception e) {
						// Loops over accomodation until its empty, will eventually hit out of bounds
					}
					break;
				case 'i':
					int in = 0;
					System.out.print("\nEnter an ID > ");
					in = Integer.parseInt(scan.nextLine());
					try {
						accomodation.get(in);
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Index Out of Bounds");
						entCont();
					}

					System.out.println("selecting package");
					packageAccomodation = accomodation.get(in);
					accomodation.get(in).available(false);
					entCont();

					break accomodationLoop;
				case 'n':
					break;
				case 'p':
					break;
				default:
					break;
			}
		}

	}
}
