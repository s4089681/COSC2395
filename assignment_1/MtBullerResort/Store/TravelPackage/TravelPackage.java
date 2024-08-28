package MtBullerResort.Store.TravelPackage;

import MtBullerResort.Customer.Level;
import MtBullerResort.Store.Saveable;
import MtBullerResort.Store.Lesson.Lesson;
import MtBullerResort.Store.LiftPass.LiftPass;
import MtBullerResort.Store.Accomodation.Accomodation;

import java.util.ArrayList;
import java.io.*;

public class TravelPackage {
	// Will each travel package only have one accomodation, one lesson and one lift
	// pass? If not can change objects to ArrayLists of objects
	private Level level; // Level of lessons / lift pass associated with package
	private Accomodation accomodation;
	private Lesson lesson;
	private LiftPass liftPass;
	private int id;
	private static int nextId = 0;

	// A package wont always have a lesson as a package may not contain a lesson or
	// a lift pass, however it will always contain accomodation
	//
	// Therefore we can overload constructors to allow for variations of input,
	// whilst ensuring there is accomodation

	public TravelPackage(Level level, Accomodation accomodation) {
		this.level = level;
		this.accomodation = accomodation;
		this.id = nextId;
		nextId++;
	}

	public TravelPackage(Level level, Accomodation accomodation, Lesson lesson) {
		this(level, accomodation);
		this.lesson = lesson;
	}

	public TravelPackage(Level level, Accomodation accomodation, LiftPass liftPass) {
		this(level, accomodation);
		this.liftPass = liftPass;
	}

	public TravelPackage(Level level, Accomodation accomodation, LiftPass liftPass, Lesson lesson) {
		this(level, accomodation, liftPass);
		this.lesson = lesson;
	}

	public static ArrayList<TravelPackage> loadTravelPackage() {
		ArrayList<TravelPackage> travelPackages = new ArrayList<>();
		File[] arr = new File("./Packages/").listFiles();
		for (File file : arr) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);

				System.out.println("Reading travel package with id: " + ((TravelPackage) ois.readObject()).getId());
				travelPackages.add((TravelPackage) ois.readObject());

				ois.close();
				fis.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return travelPackages;
	}

	public static void writeTravelPackage(ArrayList<TravelPackage> packages) {
		try {
			for (TravelPackage p : packages) {

				String directory = System.getProperty("user.dir")
						+ "/MtBullerResort/Store/TravelPackage/Packages/TravelPackage_" + p.getId();

				FileOutputStream fos = new FileOutputStream(directory);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				System.out.println("Writing file to: " + d);
				oos.writeObject(p);

				// Close Streas after use
				oos.close();
				fos.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return this.id;
	}
}
