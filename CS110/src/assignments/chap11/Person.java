package assignments.chap11;

public class Person {
	private String name;
	private String adress;
	private int phoneNumber;
	private String eMailAdress;

	public Person() {
	}

	public Person(String name, String adress, int phoneNumber,
			String eMailAdress) {
		super();
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.eMailAdress = eMailAdress;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String geteMailAdress() {
		return eMailAdress;
	}

	@Override
	public String toString() {
		return "Person " + getName();
	}

}
