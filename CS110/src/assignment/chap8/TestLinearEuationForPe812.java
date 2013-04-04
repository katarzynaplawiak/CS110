package assignment.chap8;

import java.util.Scanner;

public class TestLinearEuationForPe812 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the endpoints of the first line segment: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("Enter the endpoints of the second line segment: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = (y2 - y1);
		double b = (x1 - x2);
		double c = (y4 - y3);
		double d = (x3 - x4);
		double e = (a * x1 + b * y1);
		double f = (c * x3 + d * y3);
		LinearEquation segmentIntersection = new LinearEquation(a, b, c, d, e,
				f);
		if (segmentIntersection.isSolvable()) {
			System.out.println("The intersecting point is: ("
					+ segmentIntersection.getX() + ", "
					+ segmentIntersection.getY() + ")");
		} else {
			System.out.println("Equation is not solvable");
		}

	}
}