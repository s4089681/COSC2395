package MtBullerResort.Store.Lesson;

import MtBullerResort.Store.Purchasable;

public class Lesson implements Purchasable {
	@Override
	public double getPrice() {
		return 10.0;
	}

	@Override
	public double getPrice(int a) {
		return 10.0;
	}
}
