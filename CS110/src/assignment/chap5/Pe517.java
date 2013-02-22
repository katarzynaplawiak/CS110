package assignment.chap5;

import java.util.Scanner;

public class Pe517 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int number = input.nextInt();

		printMatrix(number);

	}

	public static void printMatrix(int n) {
		int element;
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				element = (int) (Math.random() * 2);
				System.out.print(element + " ");

			}

			System.out.println();
		}
	}

}
