import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<Movie>();

		movies.add(new FeatureFilm("Film 1", "director", 2024, 6, "Genre"));
		movies.add(new FeatureFilm("Film 2", "director", 2023, 7, "Genre"));

		movies.add(new Documentary("Doc 1", "director", 2019, 3, "Subject"));
		movies.add(new Documentary("Doc 2", "director", 2012, 4, "Subject"));
		movies.add(new Documentary("Doc 3", "director", 1999, 5, "Subject"));

		// Sorts collections from highest to lowest then prints the first isntance of a
		// Documentary
		Collections.sort(movies, Collections.reverseOrder());
		for (Movie m : movies) {
			if (m instanceof Documentary) {
				System.out.println("The best Documentary is " + m.toString());
				break;
			}
		}

		for (Movie m : movies) {
			if (m instanceof FeatureFilm) {
				System.out.println("The best Feature Film is " + m.toString());
				break;
			}
		}
	}
}
