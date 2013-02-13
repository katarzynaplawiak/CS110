package assignment.chap4;

public class Pe25 {

	
	public static void main(String[] args) {
		
		displayPi(10000);
		displayPi(20000);
		displayPi(100000);

	}
	public static void displayPi(int number){
		double Pi = 0;
		for ( int i = 1; i<= number; i++){
			int power = i+1;
			double calculation = 4 * (Math.pow(-1, power) / ((double)(2 *i) - 1));
			Pi += calculation;
			}
	System.out.printf("\nThe approximate value of PI for i = %d is %.6f\n", number, Pi);
	}
	

}
