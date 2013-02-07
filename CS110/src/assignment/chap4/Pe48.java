package assignment.chap4;

import java.util.Scanner;

public class Pe48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double bestScore = 1;
		double secondBestScore = 0;
		double temp = 0;
		String bestName= " ";
		String secondBestName= " ";
		String nameTemp= " ";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		for ( int i = 0; i < numberOfStudents; i++){
			System.out.print("Enter student's name: ");
			String studentName = input.next();
			System.out.print("Enter student's score: ");
			double studentScore = input.nextDouble();
			
			
			if (studentScore > bestScore){
				temp = bestScore;
				bestScore = studentScore;
				secondBestScore = temp;
				
				
				nameTemp= bestName;
				bestName = studentName;
				secondBestName = nameTemp;
			
			}
			else if (studentScore > secondBestScore){
				secondBestScore = studentScore;
				secondBestName = studentName;
			}
		
			
		}
		System.out.printf("\nThe best student: %s \tScore: %.2f" + 
		"\nSecond best student: %s \tScore: %.2f",bestName, bestScore,secondBestName, secondBestScore);
	

	}

}
