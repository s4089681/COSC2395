public class TestMovie {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie("The Lorax", "Chris Renaud", 2012, 6);

		m1.setTitle("Cars 2");
		m1.setDirector("John Lasseter");
		m1.setYear(2011);
		m1.setRating(4);

		System.out.println(m1.toString());
		m1.setRating(10);
		System.out.println(m1.toString());
	}
}
