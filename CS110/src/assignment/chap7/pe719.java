package assignment.chap7;

import java.util.Scanner;

public class pe719 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] numbers = createArrayFromInput(input);
		displayArray(numbers);
		System.out.println(isConsecutiveFour(numbers));

	}

	public static int[][] createArrayFromInput(Scanner s) {
		System.out.print("Enter number of rows: ");
		int rows = s.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = s.nextInt();
		int[][] array = new int[rows][columns];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = s.nextInt();
			}

		}
		return array;
	}

	public static void displayArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isConsecutiveFour(int[][] array) {
		return (checkHorizontal(array) || checkVertical(array) || checkDiagonal(array));
	}

	public static boolean checkHorizontal(int[][] array) {
		boolean result = false;
		if (array[0].length < 4) {
			result = false;
		} else {

			search: for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[0].length - 3; column++) {
					for (int nextCol = column + 1; nextCol < column + 4; nextCol++) {
						if (array[row][column] == array[row][nextCol]) {
							result = true;
						} else {
							result = false;
							break;
						}
					}
					if (result == true) {
						break search;
					}
				}

			}
		}
		return result;
	}

	public static boolean checkVertical(int[][] array) {
		boolean result = false;
		if (array.length < 4) {
			result = false;
		} else {
			search: for (int column = 0; column < array[0].length; column++) {
				for (int row = 0; row < array.length - 3; row++) {
					for (int nextRow = row + 1; nextRow < row + 4; nextRow++) {
						if (array[row][column] == array[nextRow][column]) {
							result = true;
						} else {
							result = false;
							break;
						}

					}
					if (result == true) {
						break search;

					}
				}
			}

		}
		return result;
	}

	public static boolean checkDiagonal(int[][] array) {
		return (checkLeftDiagonal(array) || checkRightDiagonal(array));
	}

	public static boolean checkLeftDiagonal(int[][] array) {
		boolean result = false;

		search: for (int row = 0; row < array.length - 3; row++) {
			for (int column = 0; column < array[0].length - 3; column++) {
				for (int nextColumn = column + 1, nextRow = row + 1; (nextColumn < column + 4 && nextRow < row + 4); nextColumn++, nextRow++) {
					if (array[row][column] == array[nextRow][nextColumn]) {
						result = true;

					} else {
						result = false;
						break;
					}
				}
				if (result == true) {
					break search;
				}

			}

		}
		return result;
	}

	public static boolean checkRightDiagonal(int[][] array) {
		boolean result = false;
		search: for (int row = array.length - 1; row - 3 >= 0; row--) {
			for (int column = 0; column < array[0].length - 3; column++) {

				for (int nextColumn = column + 1, nextRow = row - 1; (nextColumn < column + 4 && nextRow > row - 4); nextColumn++, nextRow--) {
					if (array[row][column] == array[nextRow][nextColumn]) {
						result = true;

					} else {
						result = false;
						break;
					}
				}
				if (result == true) {
					break search;
				}
			}

		}
		return result;
	}
}
