package assignments.chap11;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;

	Employee() {
		dateHired = new MyDate();
	}

	public Employee(String name, String adress, int phoneNumber,
			String eMailAdress, double salary, String office) {
		super(name, adress, phoneNumber, eMailAdress);
		this.dateHired = new MyDate();
		this.salary = salary;
		this.office = office;
	}

	public Employee(String office, double salary) {
		super();
		this.office = office;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee " + super.getName();
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

}
