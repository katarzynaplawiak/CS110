package assignments.chap10;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] args) {
		ATM newATM = new ATM();
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter an id (0-9): ");
			int idNum = input.nextInt();
			if (idNum < 0 || idNum >= newATM.getNUMBER_OF_ACCOUNTS()) {
				System.out.println("Incorrect id number.Try again");
				continue;
			} else {
				newATM.displayMenu();
				int number = input.nextInt();
				Account a = newATM.getAccount(idNum);
				newATM.process(a, number);
			}
		}
	}
}
