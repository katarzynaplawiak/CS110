package assignment.chap7;

import java.util.Scanner;

public class PE7_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char[][] grid = new char[3][3];
		char player1 = 'X';
		char player2 = 'O';
		boolean end = false;
		printGrid(grid);
		while (end == false) {
			takeTurn(input, player1, grid);
			end = checkGameStatus(player1, grid);
			if (end == true) {
				break;
			} else {
				takeTurn(input, player2, grid);
				end = checkGameStatus(player2, grid);
			}
		}
	}

	public static void takeTurn(Scanner s, char player, char[][] grid) {
		int row = readInputRow(s, player);
		int column = readInputColumn(s, player);
		grid[row][column] = player;
		printGrid(grid);
	}

	public static void printGrid(char[][] array) {
		String line = "-------------";

		for (int i = 0; i < array.length; i++) {
			System.out.println(line);
			System.out.print("| ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println(line);
	}

	public static int readInputRow(Scanner s, char player) {
		int value;
		System.out.print("Enter a row (0, 1,or 2) for player " + player + " :");
		value = s.nextInt();
		return value;

	}

	public static int readInputColumn(Scanner s, char player) {
		int value;
		System.out.print("Enter a column (0, 1,or 2) for player " + player
				+ " :");
		value = s.nextInt();
		return value;
	}

	public static boolean checkGameStatus(char player, char[][] array) {
		boolean end = false;
		if (checkWinner(array)) {
			System.out.print("Player " + player + " won");
			end = true;

		}

		else if (checkDraw(array)) {
			System.out.print("It's a draw");
			end = true;
		} else {
			System.out.println("Continue:");
			end = false;
		}
		return end;
	}

	public static boolean checkWinner(char[][] array) {
		return (leftDiagonalSolution(array) || rightDiagonalSolution(array)
				|| horizontalSolution(array) || vericalSolution(array));
	}

	public static boolean checkDraw(char[][] array) {
		return (allCellsOccupied(array));

	}

	public static boolean allCellsOccupied(char[][] array) {
		boolean result = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == '\u0000') {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public static boolean leftDiagonalSolution(char[][] array) {
		boolean result = false;
		char currentCheck = array[0][0];
		for (int i = 1; i < array.length; i++) {
			if ((array[i][i] == currentCheck) && (currentCheck != '\u0000')) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean rightDiagonalSolution(char[][] array) {
		boolean result = false;
		char firstCheck = array[0][array[0].length - 1];
		for (int i = 1; i < array.length; i++) {
			if ((array[i][array[0].length - i - 1] == firstCheck)
					&& (firstCheck != '\u0000')) {
				result = true;
			} else {
				result = false;
				break;
			}

		}
		return result;
	}

	public static boolean horizontalSolution(char[][] array) {
		boolean result = false;
		for (int i = 0; i < array.length; i++) {
			char firstCheck = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if ((array[i][j] == firstCheck) && (firstCheck != '\u0000')) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			if (result == true) {
				break;
			}
		}
		return result;
	}

	public static boolean vericalSolution(char[][] array) {
		boolean result = false;
		for (int column = 0; column < array[0].length; column++) {
			char firstCheck = array[0][column];
			for (int row = 1; row < array.length; row++) {
				if ((array[row][column] == firstCheck)
						&& (firstCheck != '\u0000')) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			if (result == true) {
				break;
			}
		}
		return result;
	}

}
