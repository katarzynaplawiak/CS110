package assignment.chap2;

import java.util.Scanner;

public class PE210 {
	
	public static void main(String[] args) {
		double waterWeight, initialTempCelsius, finalTempCelsius;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount of water in kiograms: ");
		waterWeight = s.nextDouble();
		System.out.println("Enter the initial temperature: ");
		initialTempCelsius = s.nextDouble();
		System.out.println("Enter the final temperature: ");
		finalTempCelsius = s.nextDouble();
		double energy = waterWeight * (finalTempCelsius - initialTempCelsius) * 4184;
		System.out.println("The energy needed is "+ energy);

	}

}
