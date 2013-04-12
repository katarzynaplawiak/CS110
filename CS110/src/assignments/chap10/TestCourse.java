package assignments.chap10;

public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("CS110");
		course1.addStudent("John Smith");
		course1.addStudent("Rebecca Star");
		course1.addStudent("Matthew Gold");
		course1.dropStudent("Rebecca Star");
		course1.displayCourse();
	}
}
