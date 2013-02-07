package assignment.chap4;

import java.util.Scanner;

public class Pe47 {

	
	public static void main(String[] args) {
	double currentTuition = 10000.0;
	int years = 10;
	double newTuition = 0.0;
	double fourYearStudiesValue= 0.0;
	double increaseRate = 0.05;
	double currentTuitionCopy = currentTuition;

	for ( int i = 0; i < years ; i++){
		newTuition = currentTuitionCopy * (1 + increaseRate);
		currentTuitionCopy = newTuition;
		}
	double newTuitionCopy = newTuition;
	double totalFourYearStudiesValue= 0;

	for ( int i = 0; i < 4 ; i++){
		fourYearStudiesValue = newTuitionCopy * (1 + increaseRate);
		newTuitionCopy = fourYearStudiesValue;
		totalFourYearStudiesValue += fourYearStudiesValue;
		
	}
	System.out.printf("In ten years the tuition will cost $%.2f." +
	"\nThe cost of four year studies which will start ten years from now is $%.2f.", newTuition,totalFourYearStudiesValue );
	
}
}

