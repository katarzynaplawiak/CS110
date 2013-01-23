package assignment.chap2;

import java.util.Scanner;


public class PE22 {
	public static void main(String[] args){
		double radius, length;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius and length of a cylinder: ");
		radius = s.nextDouble();
		length= s.nextDouble();
		double area = radius * radius * Math.PI;
		double volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
