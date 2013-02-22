package assignment.chap5;

import java.util.Scanner;

public class Pe525 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of milliseconds: ");
		long milliseconds = input.nextLong();
		System.out.print(convertMillis(milliseconds));

	}

	public static String convertMillis(long millis) {

		long seconds = millis / 1000;

		long minutes = seconds / 60;
		seconds = seconds % 60;

		long hours = minutes / 60;
		minutes = minutes % 60;

		String stringFormat = hours + ":" + minutes + ":" + seconds;

		return stringFormat;
	}

}
