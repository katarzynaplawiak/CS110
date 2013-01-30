package assignment.chap3;

import java.util.Scanner;

public class PE332 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		double xp0= input.nextDouble();
		double yp0= input.nextDouble();
		double xp1= input.nextDouble();
		double yp1 = input.nextDouble();
		double xp2 = input.nextDouble();
		double yp2 = input.nextDouble();
		
		if (findPointPosition(xp0, yp0, xp1, yp1, xp2, yp2) > 0){
			 System.out.println("p2 is on the left side of the line");
		}
		else if (findPointPosition(xp0, yp0, xp1, yp1, xp2, yp2) ==0){
			System.out.println("p2 is on the same line");
		}
		else if (findPointPosition(xp0, yp0, xp1, yp1, xp2, yp2) < 0) {
			System.out.println("p2 is on the right side of the line");
		}
		
	}


public static double findPointPosition (double xp0, double yp0, double xp1, double yp1, double xp2, double yp2 ){
	double position = (xp1 - xp0) * (yp2 - yp0) - (xp2 - xp0) * (yp1 - yp0);
	return position;
	}
	
	
}