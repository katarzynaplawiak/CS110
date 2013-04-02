package assignment.chap8;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int col = input.nextInt();
		double[][] elements = new double[rows][col];
		System.out.println("Enter the array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				elements[i][j] = input.nextDouble();
			}

		}
		Location maxValLocation = new Location();
		maxValLocation = Location.locateLargest(elements);

		System.out.println("The location of the largest element is "
				+ maxValLocation.getMaxValue() + " at ("
				+ maxValLocation.getRow() + ", " + maxValLocation.getColumn()
				+ ")");
	}
}
