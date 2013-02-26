package assignment.chap5;

import java.util.Scanner;

public class MyTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)){
			System.out.printf("The area of the triangle is %.4f",  area(side1, side2, side3));
		}
		else{
			System.out.print("Input is invalid");
		}
	}
	public static boolean isValid(double value1, double value2, double value3){
		return (((value1 + value2) > value3 )|| ((value2 + value3) > value1) || ((value3 + value1)>value2));
	}
	public static double area(double val1, double val2, double val3){
		double s = (val1 + val2 + val3)/2;
		double area = Math.sqrt(s*(s-val1)*(s-val2)*(s-val3));
		return area;
		
	}
}
