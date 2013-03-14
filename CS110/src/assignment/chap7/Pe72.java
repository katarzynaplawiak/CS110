package assignment.chap7;

import java.util.Scanner;

public class Pe72 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: ");
		double[][] matrix = new double[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}

		System.out.println("Sum of the elements in the major diagonal is "
				+ sumMajorDiagonal(matrix));

	}

	public static double sumMajorDiagonal(double[][] m) {
		double total = 0;
		for (int row = 0; row < m.length; row++) {
			total += m[row][row];
		}
		return total;
	}

}
