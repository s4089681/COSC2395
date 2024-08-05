import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
	String name;
	int id;
	ArrayList<Rent> rent = new ArrayList<Rent>();
	int nextCustId;

	public Customer(String name) {
		this.name = name;
	}

	public void addRent(int copyNo, LocalDate date, int days) {
		rent.add(new Rent(copyNo, date, days));
	}

	public void returnRent(Rent r) {
		rent.remove(rent.indexOf(r));
	}

	public void listRented() {
		for (Rent i : rent) {
			System.out.println(i.toString());
		}
	}

	// Iterates over rent, returns rent with copyNo
	// if not found, returns empty rent object
	public Rent searchRentByCopyNo(int copyNo) {
		for (Rent i : rent) {
			return i.copyNo == copyNo ? i : new Rent();
		}
	}
}
