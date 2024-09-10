package MtBullerResort.Store.LiftPass;

import MtBullerResort.Store.Purchasable;

public class LiftPass implements Purchasable {
	private int days;

	@Override
	public double getPrice(int a) {
		return 15.0;
	}

	@Override
	public double getPrice(){
		return 15.0;
	}
}
