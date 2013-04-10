package assignments.chap10;

public class ATM {

	private final int NUMBER_OF_ACCOUNTS = 10;
	private Account[] accounts;

	ATM() {
		this.accounts = createAccounts(NUMBER_OF_ACCOUNTS);
	}

	public Account[] createAccounts(int n) {
		Account[] a = new Account[n];
		for (int i = 0; i < n; i++) {
			a[i] = new Account(i, 100);
		}
		return a;
	}

	public void displayMenu() {
		System.out
				.print("Main Menu:\n1:check balance\n2:withdraw\n3:deposit\n4:exit\nEnter a choice: ");
	}

	public void process(Account a, int number) {
		switch (number) {
		case (1):
			System.out.println("The balance is "+ a.getBalance());
			break;
		case (2):
			a.withdrawOperation();
			break;
		case (3):
			a.depositOperation();
			break;
		case (4):
			return;
		}
	}

	public Account getAccount(int number) {

		return this.accounts[number];
	}
}
