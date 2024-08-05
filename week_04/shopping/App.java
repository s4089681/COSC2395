public class App {
	public static void main(String[] args) {

		ShoppingList list = new ShoppingList();

		list.addItem(new Item("Item 1", 12, 2));
		list.addItem(new Item("Item 2", 4, 3));

		list.dispItems();
	}
}
