package assignments.chap10;

public class Tax {
	private int fillingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[] rates;
	double taxableIncome;
	private int bracketsLength;
	public static final int NUMBER_OF_FILL_STATUS = 4;

	Tax() {

	}

	Tax(int fillingStatus, int[][] brackets, double[] rates,
			double taxableIncome) {
		this.fillingStatus = fillingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
		this.bracketsLength = brackets[fillingStatus].length;
	}

	public int getFillingStatus() {
		return fillingStatus;
	}

	public void setFillingStatus(int fillingStatus) {
		this.fillingStatus = fillingStatus;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		double tax = 0;
		int i;
		double taxIncome = this.taxableIncome;
		for (i = 0; i < this.bracketsLength; i++) {
			if (this.taxableIncome <= this.brackets[this.fillingStatus][i]) {
				tax += taxIncome * this.rates[i];
				break;
			} else {
				if (i == 0) {
					tax += this.brackets[this.fillingStatus][i] * this.rates[i];
					taxIncome -= this.brackets[this.fillingStatus][i];
				} else {
					tax += (this.brackets[this.fillingStatus][i] - this.brackets[this.fillingStatus][i - 1])
							* this.rates[i];
					taxIncome -= this.brackets[this.fillingStatus][i]
							- this.brackets[this.fillingStatus][i - 1];
				}
			}
		}
		if (this.taxableIncome > this.brackets[this.fillingStatus][this.bracketsLength - 1]) {
			tax += taxIncome * this.rates[this.bracketsLength];
		}
		return tax;
	}

	public int getLength() {
		return this.bracketsLength;
	}

}