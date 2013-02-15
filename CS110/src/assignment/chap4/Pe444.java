package assignment.chap4;

public class Pe444 {

	public static void main(String[] args) {
		final int NUMBER_OF_TRIALS = 1000000;
		int numberOfHits = 0;
		
		
		for (int i = 0; i < NUMBER_OF_TRIALS; i++){
			double x = Math.random() * 2.0 -1;
			double y = Math.random() * 2.0 -1;
			if (isInRegion1(x, y) || isInRegion3(x,y)){
				numberOfHits++;
			}
			
		}
		double probabilityOfHits = (double)numberOfHits/ NUMBER_OF_TRIALS; 
		
		System.out.printf ("The probability for a dart to hit an odd-area is %.8f", probabilityOfHits);

	}
	public static boolean isInRegion1 (double x, double y){
		boolean isInArea1 = false;
		if ((x <= 0 && y>=0) || (x <= 0 && y <=0)){
			isInArea1  = true;
	}
		return isInArea1;

}
	public static boolean isInRegion3 (double x, double y){
		boolean isInArea3 = false;
		if ((y <= -x + 1) && (x >= 0 && y >= 0)) {
			isInArea3 = true;
		}
		return isInArea3;
	}
}
