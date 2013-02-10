package assignments.chap6;

import java.util.Scanner;

public class Pe65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numbers = new int [10];
		Scanner input = new Scanner (System.in);
			System.out.print("Enter ten numbers ");
			for ( int i = 0; i < numbers.length; i++){
				int number = input.nextInt();
				int distinctNumbersCount = 0;
				int numberSearch = java.util.Arrays.binarySearch(numbers,number);
				if ( numberSearch < 0 ){
				numbers [distinctNumbersCount] = number;
				}
				java.util.Arrays.sort(numbers);
			}
			System.out.println(displayDistinctNumbers(numbers));
			}
			public static String displayDistinctNumbers( int [] array){
				String output= "The distinct numers are: ";
				String numberAsString = " ";
				for (int k = 0; k< array.length; k++){
				if (array[k]!= 0){
					numberAsString= array[k]+ " ";
					output+=numberAsString;
				}
			}
			return output;
	}
}
	


				
				