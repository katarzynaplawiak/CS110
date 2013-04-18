package assignments.chap11;

public class Staff extends Employee {
	private String title;

	Staff() {

	}

	Staff(String title) {
		super();
		this.title = title;
	}

	public Staff(String office, double salary) {
		super(office, salary);

	}

	public Staff(String name, String adress, int phoneNumber,
			String eMailAdress, double salary, String office, String title) {
		super(name, adress, phoneNumber, eMailAdress, salary, office);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff " + super.getName();

	}

	public String getTitle() {
		return title;
	}
}