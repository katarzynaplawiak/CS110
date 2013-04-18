package assignments.chap11;

import java.util.Scanner;

public class TestMyStack {
	public static void main(String[] args) {
		final int NUMBER_OF_STRINGS = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + NUMBER_OF_STRINGS
				+ " strings to store in a stack: ");
		MyStack stack = new MyStack();
		for (int i = 0; i < NUMBER_OF_STRINGS; i++) {
			stack.add(input.next());
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
