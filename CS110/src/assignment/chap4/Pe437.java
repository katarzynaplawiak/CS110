package assignment.chap4;

import java.util.Scanner;

public class Pe437 {

	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter a decimal number to convert to binary number: ");
	int number = input.nextInt();
	
	System.out.print("The number " + number + " in binary is " + decimalToBinary(number));

	}
	public static String decimalToBinary(int number){
		String binary = "";
		int num = number;
		
		while ( num!=0){
			 
			 if (num %2 ==1){
				 binary = "1"+ binary;
			 }
			 else{
				 binary = "0"+ binary; 
			
			 }
			 num = num/2;
		 }
		 return binary;
	}
}

