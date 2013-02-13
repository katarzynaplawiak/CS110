package assignment.chap4;

import java.util.Scanner;

public class Pe437 {

	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter a decimal number to convert to binary number: ");
	int number = input.nextInt();
	
	System.out.print(decimalToBinary(number));

	}
	public static String decimalToBinary(int num){
		String binary = "";
		for (int i = 7; i >= 0; i--){
			
			int placeValue =(int)( Math.pow(2, i));
			if ((num % placeValue) == num){
				binary += "0";
			}
			else if ((num % placeValue) == 0){
				binary += "1";
				if (i>0){
					binary = endWithZeroes(binary, i);
					break;
				}
			}
			else if ( (num % placeValue) < num){
				binary += "1";
				num -= placeValue;
			}
		}	
		return binary;
		}
	public static String endWithZeroes (String binary, int i){
		for ( int l = 0; l < (7 -(7-i)); l++){
			binary+="0";
		}
		return binary;
		
	}

}
