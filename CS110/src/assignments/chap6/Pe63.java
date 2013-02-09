package assignments.chap6;

import java.util.Scanner;

public class Pe63 {

	
	public static void main(String[] args) {
		int [] count = new int [100];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the integers between 1 and 100 (the input ends if it's 0): ");
		int number = input.nextInt();
		while ( number != 0){
			count[number]+=1;
			System.out.print("Enter the integers between 1 and 100: ");
			number = input.nextInt();
		}
		displayOccurence(count);
	}
	public static void displayOccurence ( int [] myArray){
		for (int i =0; i< myArray.length; i++){
			if (myArray[i] == 1){
				System.out.printf("\n%d occurs 1 time", i);
			}
			else if (myArray[i] > 1){
				System.out.printf("\n%d occurs %d times", i, myArray[i]);
			}
		
		}
		
	}

}
