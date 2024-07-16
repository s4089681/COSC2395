public class Movie {
	private String title;
	private String director;
	private int year;
	private int rating;

	public Movie() {
	}

	public Movie(String title, String director, int year, int rating) {
		this.title = title;
		this.director = director;
		this.year = year;
		setRating(rating);
	}

	public String getTitle() {
		return this.title;
	}

	public String getDirector() {
		return this.director;
	}

	public int getYear() {
		return this.year;
	}

	public int getRating() {
		return this.rating;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setRating(int rating) {
		if (rating < 0 || rating > 5) {
			this.rating = 0;
		} else {
			this.rating = rating;
		}
	}

	@Override
	public String toString() {
		return "Title: " + this.title + " Director: " + this.director + " Year: " + this.year + " Rating: " + this.rating;
	}
}
