package assignment.chap3;

import java.util.Scanner;

public class PE322 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the point with two coordinates: ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		if (isInTheCircle(x1, y1)) {
			System.out.printf("Point (%.1f, %.1f) is in the circle", x1*1.0, y1*1.0);
		}
		else {
			System.out.printf("Point (%.1f, %.1f) is not in the circle", x1 * 1.0, y1 * 1.0);
			
		}
		
		
		}


public static boolean isInTheCircle (int x, int y)
{
	 double distance = Math.pow((Math.pow((x - 0), 2) + Math.pow((y- 0), 2)), 0.5);
	return (distance<=10);
}

	
}

	
