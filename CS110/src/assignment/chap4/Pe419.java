package assignment.chap4;

public class Pe419 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUMBER_OF_LINES = 8;
		String space = "    ";
		for (int i = 1; i <= NUMBER_OF_LINES ; i++){
			for (int j =1; j <= (NUMBER_OF_LINES-i); j++){
				System.out.print(space);
				}
			for ( int k =1 ; k<=i; k++){
					int power = k-1;
				System.out.printf("%4d", (int)Math.pow(2, power));
				power++;}
				
			for ( int m=2; m <= i; m++){
			int power = i-m;
			System.out.printf("%4d",(int)Math.pow(2, power));
			power--;			
			}
			System.out.println();
			}
			
			}	
			}
			
