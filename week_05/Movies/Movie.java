public abstract class Movie implements Comparable<Movie> {
	protected String title;
	protected String director;
	protected String purpose;
	protected int year;
	protected int rating = 0;

	public Movie() {
	}

	public Movie(String title, String director, int year, int rating) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.rating = rating;
	}

	public int getRating() {
		return this.rating;
	}

	public abstract void setPurpose(String purpose);

	@Override
	public String toString() {
		return "Title: " + this.title + " Director: " + director + " Year: " + this.year + " Rating: " + this.rating;
	}

	@Override
	public int compareTo(Movie o) {
		// Compares rating, assumes ratings 0-10
		int r = o.getRating();
		if (rating == r) { // If rating is same as compraed, return 0
			return 0;
		} else if (rating < r) { // If rating is less than compares, return -1
			return -1;
		} else { // Else return 1
			return 1;
		}
	}
}
