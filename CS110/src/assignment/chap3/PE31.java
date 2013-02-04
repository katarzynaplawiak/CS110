package assignment.chap3;

import java.util.Scanner;

public class PE31 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
		
		double rootIfDiscriminantIsZero = -b / (2*a);
		
		if (discriminant >0){
			System.out.printf("The roots are %.5f and %.5f", root1, root2 );
	
		}
		else if (discriminant == 0){
			System.out.println("The root is " + rootIfDiscriminantIsZero);
		
		}
		else {
			System.out.println("The equation has no real roots");
		}

	}

}
