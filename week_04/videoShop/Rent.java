import java.time.LocalDate;

public class Rent {
	int copyNo;
	int days;
	LocalDate date;

	public Rent() {
	}

	public Rent(int copyNo, LocalDate date, int days) {
		this.copyNo = copyNo;
		this.date = date;
		this.days = days;
	}

	@Override
	public String toString() {
		return "";
	}

	public int getCopyNo() {
		return this.copyNo;
	}
}
