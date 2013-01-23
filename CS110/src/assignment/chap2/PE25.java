package assignment.chap2;

import java.util.Scanner;

public class PE25 {
	
	public static void main(String[] args) {
		double subtotal, gratuityRate, total, gratuity;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = s.nextDouble();
		gratuityRate = s.nextDouble();
		gratuity = subtotal * (gratuityRate/100.0);
		total = subtotal + gratuity;
		
		System.out.println("The gratuity is " + gratuity + "$ and total is $" + total);
				
		
		

	}

}
