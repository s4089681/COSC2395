import java.util.ArrayList;

public class ShoppingList {
	ArrayList<Item> items;

	public ShoppingList() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public Item getItem(int index) {
		return items.get(index);
	}

	public Item remItem(int i) {
		return items.remove(i);
	}

	public void dispItems() {
		for (Item item : items) {
			System.out.println(item.toString());
		}
	}

	public int size() {
		return items.size();
	}

}
