package assignments.chap6;

import java.util.Scanner;

public class Pe61 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		int [] scores = new int [numberOfStudents] ;
		
		System.out.printf("Enter " + scores.length +  " scores: ");
		for ( int i =0; i < scores.length; i++) {
			scores [i] = input.nextInt();
		}
		int max = scores[0];
		for( int i = 1; i < scores. length; i++ ){
			if (scores[i]> max ) {
				max = scores [i];
				}
		}
		
		String grade = " ";
		
		for (int i = 0; i< scores.length; i++) {
			
			if (scores[i] >= (max -10)) {
				grade=  "A";
				System.out.printf("Student %d score is %d and grade is %s",i,scores[i], grade  );
			}
			else if (scores[i] >= (max-20)){
				grade= "B";
				System.out.printf("Student %d score is %d and grade is %s", i, scores[i], grade  );
			} 
			else if (scores[i] >= (max-30)){
				grade= "C";
				System.out.printf("Student %d score is %d and grade is %s", i,scores[i], grade  );
			}
			else if (scores[i] >= (max-40)){
				grade = "D";
				System.out.printf("Student %d score is %d and grade is %s", i,scores[i], grade  );
			}
			else {
				grade = "F";
				System.out.printf("Student %d score is %d and grade is %s", i,scores[i], grade  );
			}
			System.out.println();
		}
	
		
}
}


