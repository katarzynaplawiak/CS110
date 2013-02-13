package assignment.chap4;

import java.util.Scanner;

public class Pe417 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of lines: ");
int numberOfLines = input.nextInt();
for (int i = 1; i <=numberOfLines ; i++){
for (int j =1; j <=(numberOfLines-i); j++){
	System.out.print("   ");
	}
for ( int k = i; k>=1; k--){
	if(k >= 10){
		System.out.print(" "+k);
	}
	else{
		System.out.print("  "+k);
	}

	}
for ( int m = 2; m <= i; m++){
	if (m>=10){
		System.out.print(" "+m);
	}
	else{
System.out.print("  "+m);
}
}
System.out.println();}	
}
}