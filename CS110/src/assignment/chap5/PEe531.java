package assignment.chap5;

import java.util.Scanner;

public class PEe531 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter a credit card number as a long integer: ");
		Scanner input = new Scanner(System.in);

		long number = input.nextLong();

		System.out.printf("%d is %s", number, isValid(number) ? "valid"
				: "invalid");

	}

	public static boolean isValid(long number) {

		return ((getSize(number) <= 16 && getSize(number) >= 13) && (prefixMatched(
				number, 37) || (prefixMatched(number, 4)
				|| prefixMatched(number, 5) || prefixMatched(number, 6))
				&& (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0));

	}
	public static int getSize(long d) {
		String s = String.valueOf(d);
		int size = s.length();
		return size;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String s = String.valueOf(number);
		char characterDigit;
		int digit;
		int product;
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			characterDigit = s.charAt(i);
			digit = Character.getNumericValue(characterDigit);//try Integer.valueOf()
			product = digit * 2;
			sum += getDigit(product);
		}
		return sum;
	}

	

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		char characterDigit;
		int digit;

		String s = String.valueOf(number);
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			characterDigit = s.charAt(i);
			digit = Character.getNumericValue(characterDigit);
			sum += digit;

		}
		return sum;
	}

	public static int getDigit(int number) {
		int result = 0;
		if (number >= 10) {
			result = number % 10 + number / 10;
		} else {
			result = number;
		}
		return result;
	}

	

	public static boolean prefixMatched(long number, int d) {

		boolean match = false;
		if (d == getPrefix(number, getSize(d))) {
			match = true;
		}
		return match;
	}
	public static long getPrefix(long number, int k) {
		long result = number;
		for (int i = 0; i < getSize(number) - k; i++) {
			result = result / 10;
		}
		return result;
	}
}
