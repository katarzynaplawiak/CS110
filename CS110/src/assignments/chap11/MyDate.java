package assignments.chap11;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private long elapsedTime;

	MyDate() {
		GregorianCalendar c = new GregorianCalendar();
		this.year = c.get(GregorianCalendar.YEAR);
		this.month = c.get(GregorianCalendar.MONTH);
		this.day = c.get(GregorianCalendar.DAY_OF_MONTH);

	}

	MyDate(long elapsedTime) {
		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTimeInMillis(elapsedTime);
		this.year = c2.get(GregorianCalendar.YEAR);
		this.month = c2.get(GregorianCalendar.MONTH);
		this.day = c2.get(GregorianCalendar.DAY_OF_MONTH);

	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
}
