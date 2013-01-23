package assignment.chap2;

import java.util.Scanner;

public class PE27 {

	public static void main(String[] args) {
		int minutes, years, days; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		minutes = s.nextInt();
		int FullDays = minutes / 1440;
		years = FullDays / 365;
		days = FullDays % 365;
		System.out.println(minutes + " minutes is approximately "+ years + " years and " + days + " days");
		
	}

}
