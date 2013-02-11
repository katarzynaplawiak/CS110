package assignments.chap6;

import java.util.Scanner;

public class Pe61 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		double [] scores = new double [numberOfStudents] ;
		
		System.out.printf("Enter " + scores.length +  " scores: ");
		for ( int i =0; i < scores.length; i++) {
			scores [i] = input.nextDouble();
		}
		double maxValue = findMax(scores);
		
		
		displayScores (scores, maxValue);
			}
	
	
	public static double findMax (double[]array){
		double max = array[0];
		for (int i = 0; i< array.length; i++){
			if (max < array [i]) {
				max = array[i];
			}
			}
		return max;
	
	}
	
	
	public static void displayScores (double[] array, double max){
		char grade;
		for (int i = 0; i< array.length; i++) {
			if (array[i] >= (max -10)) {
				grade=  'A';
				System.out.printf("Student %d score is %.1f and grade is %c",i,array[i], grade  );
			}
			else if (array[i] >= (max-20)){
				grade= 'B';
				System.out.printf("Student %d score is %.1f and grade is %c", i, array[i], grade  );
			} 
			else if (array[i] >= (max-30)){
				grade= 'C';
				System.out.printf("Student %d score is %.1f and grade is %c", i,array[i], grade  );
			}
			else if (array[i] >= (max-40)){
				grade = 'D';
				System.out.printf("Student %d score is %.1f and grade is %c", i,array[i], grade  );
			}
			else {
				grade = 'F';
				System.out.printf("Student %d score is %.1f and grade is %c", i,array[i], grade  );
			}
			System.out.println();
		}
	} 
	}
