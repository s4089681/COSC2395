package MtBullerResort.Store;

public class LiftPass implements Purchasable {
	private int days;

	@Override
	public double getPrice() {
		return 15.0;
	}
}
