package assignments.chap11;

public class Test112 {

	public static void main(String[] args) {
		Person p = new Person("John Smith", "New York Main Street 11/25",
				111222333, "jsmith@gmail.com");
		Employee e = new Employee("Maria Smith", "New York Snowy Street 19/25",
				166222333, "msmith@gmail.com", 3000, "Building E");
		Student s = new Student("Mark Smith", "New York River Street 85/25",
				111555333, "msmith@gmail.com", Student.FRESHMEN);
		Faculty f = new Faculty("Erin Novak", "New York Sunny Street 125/25",
				666222333, "enovak@gmail.com", 2500, "Building c5",
				"Associate", "10-14");
		Staff st = new Staff("Mark Novak", "New York Rainy Street 185/25",
				66600033, "mnovak@gmail.com", 5000, "Building l", "Proffessor");

		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(s.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());

	}
}