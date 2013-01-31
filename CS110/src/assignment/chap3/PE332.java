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


public static double findPointPosition (double xPoint0, double yPoint0, double xPoint1, double yPoint1, double xPoint2, double yPoint2 ){
	double position = (xPoint1 - xPoint0) * (yPoint2 - yPoint0) - (xPoint2 - xPoint0) * (yPoint1 - yPoint0);
	return position;
	}
	
	
}