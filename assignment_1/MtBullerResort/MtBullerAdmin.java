package MtBullerResort;

import MtBullerResort.MtBullerResort;
import MtBullerResort.Customer.Customer;
import MtBullerResort.Customer.Level;

public class MtBullerAdmin {

	private static MtBullerResort mbr;

	public static void main(String args[]) {
		mbr = new MtBullerResort();
		mbr.addCustomer("Test", Level.BEGINNER);
		mbr.addCustomer("Test", Level.BEGINNER);
		mbr.addCustomer("Test", Level.BEGINNER);
		mbr.addCustomer("Test", Level.BEGINNER);

		mbr.listCustomers();

		
	}

}
