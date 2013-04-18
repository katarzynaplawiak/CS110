package assignments.chap11;

public class Student extends Person {

	private String classStatus;
	public static final String FRESHMEN = "freshmen";
	public static final String SOPHOMORE = "sophomore";
	public static final String JUNIOR = "junior";
	public static final String SENIOR = "senior";

	public Student(String classStatus) {
		super();
		this.classStatus = classStatus;
	}

	public Student() {
		super();

	}

	public Student(String name, String adress, int phoneNumber,
			String eMailAdress, String classStatus) {
		super(name, adress, phoneNumber, eMailAdress);
		this.classStatus = classStatus;

	}

	@Override
	public String toString() {
		return "Student " + super.getName();
	}

	public String getClassStatus() {
		return classStatus;
	}

}
