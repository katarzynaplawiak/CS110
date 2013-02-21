package assignment.chap4;

public class Pe419 {

	
	public static void main(String[] args) {
		final int NUMBER_OF_LINES = 8;
		int max = (int)Math.pow(2, NUMBER_OF_LINES);
		String s = String.valueOf(max);
		int fieldSize = s.length() +1;
	
		for (int i = 1; i <= NUMBER_OF_LINES ; i++){
			for (int j =1; j <= (NUMBER_OF_LINES-i); j++){
				printSpace(fieldSize);
				}
			for ( int k =1 ; k<=i; k++){
					int power = k-1;
				System.out.printf("%"+fieldSize+"d", (int)Math.pow(2, power));
				power++;}
				
			for ( int m=2; m <= i; m++){
			int power = i-m;
			System.out.printf("%"+fieldSize+"d",(int)Math.pow(2, power));
			power--;			
			}
			System.out.println();
			}
			
			}	
	public static void printSpace (int size){
		for (int i = 0; i < size; i++){
			System.out.print(" ");
	}
			}
}
			
