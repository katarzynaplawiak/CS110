package assignments.chap11;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	public Faculty() {
		super();
	}

	public Faculty(String officeHours, String rank) {
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public Faculty(String office, double salary) {
		super(office, salary);

	}

	public Faculty(String name, String adress, int phoneNumber,
			String eMailAdress, double salary, String office, String rank,
			String officeHours) {
		super(name, adress, phoneNumber, eMailAdress, salary, office);
		this.rank = rank;
		this.officeHours = officeHours;
	}

	@Override
	public String toString() {
		return "Faculty " + super.getName();
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

}
