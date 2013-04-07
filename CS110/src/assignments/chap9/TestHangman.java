package assignments.chap9;

import java.util.Scanner;

public class TestHangman {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean continueGame = true;
		while (continueGame) {
			Hangman game = new Hangman();
			while (game.isUnsolved()) {
				System.out.print("(Gues) Enter a letter in word "
						+ game.getCurrentView() + " > ");
				String letter = input.next();
				game.replaceAstrerisks(letter);

			}
			System.out.println("The word is " + game.getWord()
					+ ". You missed " + game.getCount()
					+ ((game.getCount() == 1) ? " time" : " times"));
			System.out
					.print("Do you want to guess another word? Enter y or n > ");
			String answer = input.next();
			continueGame = (answer.equals("y")) ? true : false;
		}
		System.out.println("Thanks for playing!");

	}
}