package assignments.chap10;

import java.util.ArrayList;

public class TestTax {
	public static void main(String[] args) {
		final int UPPER_VALUE = 60000;
		final int LOWER_VALUE = 50000;
		final int LENGTH_OF_INTERVAL = 1000;
		final int NUMBER_OF_INTERVALS = (UPPER_VALUE - LOWER_VALUE)
				/ LENGTH_OF_INTERVAL;
		int numOfFillStatus = Tax.NUMBER_OF_FILL_STATUS;
		int[][] taxBrackets2009 = { { 8350, 33950, 82250, 171550, 372950 },
				{ 16700, 67900, 137050, 208850, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 },
				{ 11950, 45500, 117450, 190200, 372950 } };
		int[][] taxBrackets2001 = { { 27050, 65550, 136750, 297350 },
				{ 45200, 109250, 166500, 297350 },
				{ 22600, 54625, 83250, 148675 },
				{ 36250, 93650, 151650, 297350 } };

		double[] taxRates2001 = { 0.15, 0.275, 0.305, 0.355, 0.391 };
		double[] taxRates2009 = { 0.1, 0.15, 0.25, 0.28, 0.33, 0.35 };

		ArrayList<Tax> array2001 = new ArrayList<Tax>();
		ArrayList<Tax> array2009 = new ArrayList<Tax>();
		for (int i = 0, amount = LOWER_VALUE; i <= NUMBER_OF_INTERVALS; i++, amount += LENGTH_OF_INTERVAL) {

			array2001.add(new Tax(Tax.SINGLE_FILER, taxBrackets2001,
					taxRates2001, amount));
			array2009.add(new Tax(Tax.SINGLE_FILER, taxBrackets2009,
					taxRates2009, amount));
			array2001.add(new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER,
					taxBrackets2001, taxRates2001, amount));
			array2009.add(new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER,
					taxBrackets2009, taxRates2009, amount));
			array2001.add(new Tax(Tax.MARRIED_SEPARATELY, taxBrackets2001,
					taxRates2001, amount));
			array2009.add(new Tax(Tax.MARRIED_SEPARATELY, taxBrackets2009,
					taxRates2009, amount));
			array2001.add(new Tax(Tax.HEAD_OF_HOUSEHOLD, taxBrackets2001,
					taxRates2001, amount));
			array2009.add(new Tax(Tax.HEAD_OF_HOUSEHOLD, taxBrackets2009,
					taxRates2009, amount));

		}

		System.out.println("Tax tables for taxable income from $" + LOWER_VALUE
				+ " to $" + UPPER_VALUE + " in $" + LENGTH_OF_INTERVAL
				+ " intervals");
		System.out.println("SF - Single filers"
				+ "\nMJ - Married filing jointly or qualifying widow(er)"
				+ "\nMS - Married filing separately"
				+ "\nHH - Head of household\n");
		Table table2 = new Table("2001", array2001, LOWER_VALUE, UPPER_VALUE,
				LENGTH_OF_INTERVAL, numOfFillStatus);
		table2.drawTable();
		System.out.println();

		Table table = new Table("2009", array2009, LOWER_VALUE, UPPER_VALUE,
				LENGTH_OF_INTERVAL, numOfFillStatus);
		table.drawTable();

	}
}
