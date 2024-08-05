public class Student extends Person {
	private int year;
	private String program;

	public Student() {
	}

	public Student(String id, String name) {
		super(id, name);

	}

	public Student(String id, String name, String program, int year) {
		super(id, name);
		this.program = program;
		this.year = year;

	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String toString() {
		return super.toString() + "\nProgram: " + program + "\nyear:" + year;

	}

}
