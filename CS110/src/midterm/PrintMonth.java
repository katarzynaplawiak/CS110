package midterm;

public class PrintMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMonth(5, 31);
		printMonth(2, 28);
		printMonth(6, 30);

	}

	public static void printMonth(int startDay, int dayInMonth) {
		System.out.println(" Sun Mon Tue Wed Thr Fri Sat");

		for (int i = 0; i < startDay; i++)
			System.out.print("    ");

		for (int i = 1; i <= dayInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();

	}
}
