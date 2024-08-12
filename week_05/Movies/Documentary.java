public class Documentary extends Movie {
	private String subject;

	public Documentary() {
	}

	public Documentary(String title, String director, int year, int rating, String subject) {
		super(title, director, year, rating);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + " Subject: " + subject;
	}

	@Override
	public void setPurpose(String p) {
		this.purpose = p;
	}
}
