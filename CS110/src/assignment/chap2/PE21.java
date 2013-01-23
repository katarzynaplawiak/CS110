package assignment.chap2;

import java.util.Scanner;

public class PE21 {
	public static void main(String[] args){
		double farenheit;
		double celsius;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input celsius value: ");
		celsius = s.nextDouble();
		farenheit = (9.0/5) * celsius + 32.0;
		System.out.println(celsius + " degrees celsius is "+ farenheit + " degrees farenheit");
		
		
	}
}
