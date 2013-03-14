package assignment.chap7;

import java.util.Scanner;

public class Pe76 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE = 3;
		System.out.print("Enter matrix1: ");
		double matrix1[][] = new double[SIZE][SIZE];
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		double matrix2[][] = new double[SIZE][SIZE];
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix2[row][column] = input.nextDouble();
			}
		}

		double[][] matrixMultiplication = new double[SIZE][SIZE];
		matrixMultiplication = multiplyMatrix(matrix1, matrix2);
		System.out.println("The multiplication of the matrices is");
		printMatrixOperation(matrix1, matrix2, matrixMultiplication, '*');
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c.length; j++) {
				for (int z = 0; z < c[i].length; z++) {
					c[i][j] += a[i][z] * b[z][j];
				}
			}
		}

		return c;
	}

	public static void printMatrixOperation(double[][] a, double[][] b,
			double[][] c, char operator) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(" %.1f", a[i][j]);
			}
			if (i == a.length / 2) {
				System.out.print("  " + operator + "  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(" %.1f", b[i][j]);
			}
			if (i == b.length / 2) {
				System.out.print("  =  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf(" %.1f", c[i][j]);
			}
			System.out.println();
		}
	}
}
