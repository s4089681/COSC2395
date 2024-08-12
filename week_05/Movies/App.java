import java.util.ArrayList;

public class App {
	public static void Main() {
		ArrayList<Movie> movies = new ArrayList<Movie>();

		movies.add(new FeatureFilm("Film 1", "director", 2024, 6, "Genre"));
		movies.add(new FeatureFilm("Film 2", "director", 2023, 7, "Genre"));

		movies.add(new Documentary("Doc 1", "director", 2019, 3, "Subject"));
		movies.add(new Documentary("Doc 2", "director", 2012, 9, "Subject"));
		movies.add(new Documentary("Doc 3", "director", 1999, 5, "Subject"));

		for (Movie m : movies) {
			if (m instanceof Documentary) {

			}
		}
	}
}
