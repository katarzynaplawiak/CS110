package assignment.chap3;

import java.util.Scanner;

public class PE321 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012) ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		if (month == 1){
			month = 13;
			year--;
		}
		else if (month == 2){
			month = 14;
			year--;
		}
		System.out.print("Enter the day of the month: 1-31: ");
		int dayOfTheMonth = input.nextInt();
		
		System.out.printf("Day of the week is %s", calculateDayOfTheWeek(year, month, dayOfTheMonth));
		
	}
		public static String calculateDayOfTheWeek (int year, int month, int dayOfTheMonth ){
			int century = year / 100;
			int yearOfTheCentury = year % 100;
			int dayOfTheWeek = (dayOfTheMonth + (26 * (month +1 )) / 10 + yearOfTheCentury + yearOfTheCentury /  4 + century / 4 + 5 * century) % 7;
			String dayOfTheWeekString ="";
			switch (dayOfTheWeek){
			case 0 : dayOfTheWeekString = "Saturday"; break;
			case 1 : dayOfTheWeekString = "Sunday"; break;
			case 2 : dayOfTheWeekString  = "Monday"; break;
			case 3 : dayOfTheWeekString = "Tuesday"; break;
			case 4 : dayOfTheWeekString = "Wednesday"; break;
			case 5 : dayOfTheWeekString = "Thursday"; break;
			case 6 : dayOfTheWeekString = "Friday"; break;
			}
			return dayOfTheWeekString;
		}
		
		
			
			
		
			
		
}
		
		
	


