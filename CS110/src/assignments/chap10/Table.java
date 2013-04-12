package assignments.chap10;

import java.util.ArrayList;

public class Table {
	private String year;
	private ArrayList<Tax> arr;
	private int low;
	private int high;
	private int intervalLength;
	int statusNum;

	Table(String year, ArrayList<Tax> arr, int low, int high,
			int intervalLength, int statusNum) {
		this.year = year;
		this.arr = arr;
		this.low = low;
		this.high = high;
		this.intervalLength = intervalLength;
		this.statusNum = statusNum;
	}

	public void drawTable() {
		String w = String.valueOf(this.high);
		int l = w.length() * 2;
		System.out.printf(("%s%" + l + "s%" + l + "s%" + l + "s%" + l + "s\n"),
				this.year, "SF", "MJ", "MS", "HH");
		System.out
				.println("--------------------------------------------------");
		int interval = low;

		for (int i = 0; i < this.arr.size(); i++) {
			if (i % this.statusNum == 0) {
				if (i == 0) {
					System.out.printf(("%d %s%" + (l + 0.2) + "f"), interval,
							"|", this.arr.get(i).getTax());
				} else {
					System.out.printf(("\n%d %s%" + (l + 0.2) + "f"), interval,
							"|", this.arr.get(i).getTax());
				}
				interval += intervalLength;
			}

			else {

				System.out.printf(("%" + (l + 0.2) + "f"), arr.get(i).getTax());
			}

		}
		System.out.println();
	}
}
