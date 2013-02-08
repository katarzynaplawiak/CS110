package assignment.chap4;

import java.util.Scanner;

public class Pe417 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int numberOfLines = input.nextInt();
		for (int i = 1; i <=numberOfLines ; i++){
			for (int j =1; j <=(numberOfLines-i); j++){
				System.out.print("  ");
			}
			for ( int j = i; j>=1; j--){
				System.out.print(j+ " ");
			}
			for ( int j = 2; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}	
}
