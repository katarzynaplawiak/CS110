package assignment.chap5;

import java.util.Scanner;

public class Pe517 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number n to print an n-by-n matrix: ");
		int n = input.nextInt();
		
		displayMatrix(n);

	}
	public static void displayMatrix(int number){
		int element;
		for (int row = 0; row < number; row++){
			for (int column = 0; column < number; column++){
				element= (int)(Math.random()*2);
				System.out.print(element+ " ");
				
			}
			
			System.out.println();
		}
	}

}
