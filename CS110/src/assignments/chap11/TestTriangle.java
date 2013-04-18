package assignments.chap11;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Enter the color of a triangle : ");
		String color = input.next();
		System.out.print("Is the trianle filled (true) or empty (false) ? ");
		boolean filled = input.nextBoolean();
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		System.out.println("Triangle area: " + triangle.getArea()
				+ "\nperimeter: " + triangle.getPerimeter() + "\ncolor: "
				+ triangle.getColor() + "\nIs the triangle filled? " + triangle.isFilled());
	}
}
