package assignment.chap5;

public class Pe526 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The first 100 prime palindromic numbers are: ");
		
		print100PrimePalindromicNumbers();
	}
	public static void print100PrimePalindromicNumbers(){
		final int NUMBERS_PER_LINE = 10;
		final int TOTAL_NUMBERS_TO_DISPLAY = 100;
		int number = 2;
		int count  = 0;
		while (count < TOTAL_NUMBERS_TO_DISPLAY){
			if (isPrime(number) && isPalindromic(number)){
				count++;
				
				if (count % NUMBERS_PER_LINE==0){
					System.out.print(number + " \n");
					
				}
				else{
					System.out.print(number + " ");
				}
			} 
			number++;
		}
		
	}
	public static boolean isPrime (int number){
		for (int divisor = 2; divisor <=number/2 ; divisor++){
			if (number % divisor == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindromic (int number){
		
		boolean result = false;
		String numberString = String.valueOf(number);
		for (int i = 0, j = numberString.length()-1; i <= j ;i++, j-- ){
			
		if (numberString.charAt(i)==numberString.charAt(j)){
			result = true;
		}
		else{
			result = false;
			break;
		}
		}
		return result;
		
	}
}
