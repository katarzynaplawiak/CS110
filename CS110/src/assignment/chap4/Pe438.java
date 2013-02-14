package assignment.chap4;

import java.util.Scanner;

public class Pe438 {

	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter a decimal number:  ");
	int decimalNumber = input.nextInt();
	
	System.out.printf("The number %d is %s in hexadecimal.",decimalNumber, decimalToHexadecimal(decimalNumber));
	
	}
	public static String decimalToHexadecimal ( int number){
		String hex = "";
		while( number != 0){
			int hexNumber = number % 16;
			hex  = convertToHex(hexNumber)+ hex;
			number = number / 16;
			}
		return hex;
	}
	public static char convertToHex (int hexNumber){
		if (hexNumber >= 0 && hexNumber <= 9){
			return (char)(hexNumber + '0');
		}
		else {
			return (char)(hexNumber - 10 + 'A');
		}
	}

}
