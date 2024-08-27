package MtBullerResort.Store;

public interface Purchasable {
	public double getPrice();

	public double getPrice(int multiple); // Accomodation / lift pass days will have a varying cost depending on length
}
