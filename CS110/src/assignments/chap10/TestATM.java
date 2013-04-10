package assignments.chap10;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] args) {
		ATM newATM = new ATM();
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter an id: ");
			int idNum = input.nextInt();
			newATM.displayMenu();
			int number = input.nextInt();
			Account a = newATM.getAccount(idNum);
			newATM.process(a, number);
		}
	}
}
