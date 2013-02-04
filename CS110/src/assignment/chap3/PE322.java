package assignment.chap3;

import java.util.Scanner;

public class PE322 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		
		if (isInTheCircle(x1, y1)) {
			System.out.printf("Point (%.1f %.1f) is in the circle", x1, y1);
		}
		else {
			System.out.printf("Point (%.1f %.1f) is not in the circle", x1, y1);
			
		}
		
		
		}


public static boolean isInTheCircle (double x, double y)
{
	 double distance = Math.pow((Math.pow((x - 0), 2) + Math.pow((y- 0), 2)), 0.5);
	return (distance<=10);
}

	
}

	
