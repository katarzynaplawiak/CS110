package assignments.chap6;

import java.util.Scanner;

public class Pe621 {

	
	public static void main(String[] args) {
		//take input
		Scanner input =  new Scanner (System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		
		
		
		
		//checkDirection method
		 playGame(numberOfBalls, numberOfSlots);
		
		//print path
		// print slots

	}
	public static void playGame ( int numberOfBalls, int numberOfSlots){
		
		String direction= "";
		int [] slots = new int [numberOfSlots+1];
		
		for (int i = 0; i < numberOfBalls; i++){
			String totalPath = "";
			int rightCount = 0;
			for (int j= 0; j< numberOfSlots; j++){
				
			direction = directionChoice ();
			if (direction=="R"){
				rightCount++;
			}
			totalPath += direction;	
			}
			slots[rightCount]++;
			
			System.out.println(totalPath);
		}
		System.out.println();
		displaySlots(slots);
		
		}
		
		
		
	public static String directionChoice (){
		double number = Math.random();
		String direction = "";
		if (number >= 0.5){
			direction = "R";
		}
		else {
			direction = "L";
		}
	return direction;
	}
	
	public static void displaySlots (int [] array){
		int max = findMax (array);
		int end = max;
		for (int i = 0; i < end ; i++, max-- ){
			for ( int j = 0; j < array.length; j++){
				if (array [j] >= max){
					System.out.print("0");
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}
		
}	
	public static int findMax(int [] array){
		int max = array[0];
		for (int i = 1; i < array.length; i++){
			if (array[i] > max){
				max = array [i];
			}
		}
		return max;
	}
	
}
