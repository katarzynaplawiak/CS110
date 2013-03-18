package assignment.chap7;


public class Pe74 {

	
	public static void main(String[] args) {
		int[][] weeklyHours = { { 2, 4, 3, 4, 5, 8, 8 },
				{ 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 },
				{ 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int[] totals = new int[weeklyHours.length];
		for (int i = 0; i < weeklyHours.length; i++) {
			for (int j = 0; j < weeklyHours[i].length; j++) {
				totals[i] += weeklyHours[i][j];
			}
		}
		int[] unsortedTotals = new int[totals.length];
		System.arraycopy(totals, 0, unsortedTotals, 0, totals.length);
		java.util.Arrays.sort(totals);

		for (int i = totals.length - 1; i >= 0; i--) {
			int valueUsageCount = 0;
			for (int j = 0; j < unsortedTotals.length; j++) {
				if (totals[i] == unsortedTotals[j]) {
					valueUsageCount++;
					if (valueUsageCount > 1) {
						System.out.printf("\nEmployee: " + j + ":" + totals[i]);
						i--;
					} else {

						System.out.printf("\nEmployee: " + j + ":" + totals[i]);
					}

				}
			}
		}
	}
}
