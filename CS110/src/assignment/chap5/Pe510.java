package assignment.chap5;

public class Pe510 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		while (number < 10000){
			if (isPrime(number)){
				count++;
			}
			number++;
		}
		System.out.println("The number of primes less than 10000 is "+ count);
	}
		public static boolean isPrime(int number){
			for ( int divisor = 2; divisor <=number/2 ; divisor++){
				if (number%divisor == 0){
					return false;
				}
			}
			return true;
			}
		}



