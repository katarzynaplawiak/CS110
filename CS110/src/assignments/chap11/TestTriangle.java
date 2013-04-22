package assignments.chap11;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1;
		double side2;
		double side3;
		while (true) {
			System.out.print("Enter three sides of a triangle: ");
			side1 = input.nextDouble();
			side2 = input.nextDouble();
			side3 = input.nextDouble();
			if (side1 > side2 + side3 || side2 > side1 + side3
					|| side3 > side1 + side2) {
				System.out
						.println("Triangle is impossible to construct (two sides add to less than the third)");
			} else {
				break;
			}
		}

		System.out.print("Enter the color of a triangle : ");
		String color = input.next();
		System.out.print("Is the trianle filled (true) or empty (false) ? ");
		boolean filled = input.nextBoolean();
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		System.out.println("Triangle area: " + triangle.getArea()
				+ "\nperimeter: " + triangle.getPerimeter() + "\ncolor: "
				+ triangle.getColor() + "\nIs the triangle filled? "
				+ triangle.isFilled());
	}
}
