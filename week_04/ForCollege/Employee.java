public class Employee extends Person {
	private double salary;

	public Employee() {
	}

	public Employee(String id, String name) {
		super(id, name);
	}

	public Employee(String id, String name, double sal) {
		super(id, name);
		salary = sal;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "\nsalary: " + salary;

	}

}
