package assignments.chap10;

import java.util.Arrays;

public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	private int size;

	public Course(String courseName) {
		this(courseName, 100);
	}

	public Course(String courseName, int size) {
		this.courseName = courseName;
		this.size = size;
		this.students = new String[size];
	}

	public void addStudent(String student) {
		if (numberOfStudents >= size) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;

	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (this.students[i] == student) {
				this.students[i] = "";
				while (i < numberOfStudents - 1) {
					students[i] = students[i + 1];
					i++;
				}
				numberOfStudents--;
			}
		}
	}

	public void clear() {
		Arrays.fill(students, "");
		this.numberOfStudents = 0;
	}

	public void displayCourse() {
		System.out.println("Students in the " + this.getCourseName()
				+ " course :");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(students[i]);
		}
	}

	public int getSize() {
		return size;
	}
}
