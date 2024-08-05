public class Item {
	private String item;
	private double price;
	private int qty;

	public Item(String item, double price, int qty) {
		this.item = item;
		this.price = price;
		this.qty = qty;
	}

	public String getItem() {
		return this.item;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item: " + this.item + " Price: " + this.price + " Quantity: " + this.qty;
	}
}
