public class FeatureFilm extends Movie {
	private String genre;

	public FeatureFilm() {
	}

	public FeatureFilm(String title, String director, int year, int rating, String genre) {
		super(title, director, year, rating);
		this.genre = genre;
	}

	public void setPurpose(String p) {
		this.purpose = p;
	}

	@Override
	public String toString() {
		return super.toString() + " Genre: " + this.genre;
	}
}
