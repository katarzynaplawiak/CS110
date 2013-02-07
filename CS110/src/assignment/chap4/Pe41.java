package assignment.chap4;

import java.util.Scanner;

public class Pe41 {

	public static void main(String[] args) 
	{
		
		int countPositive = 0;
		int countNegative = 0;
		int totalCount =0 ;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		while (number != 0){
			sum += number;
			if (number > 0){
				countPositive++;
			}
			else {
				countNegative++;
			}
			System.out.print("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();
		}
		totalCount = countPositive + countNegative;
		if (countPositive==0 && countNegative==0){
			System.out.println("No numbers are entered except 0");
		}
		else{
		System.out.println("The number of positives is "+ countPositive);
		System.out.println("The number of negatives is "+ countNegative);
		System.out.println("The total is " + sum);
		System.out.printf("The average is %.2f", calculateAverage(sum, totalCount));
		}
		
	}public static double calculateAverage (double sumOfNumbers, int amountOfNumbers){
		
		double avg = (double)(sumOfNumbers / amountOfNumbers);
		return avg;
	}
	}


