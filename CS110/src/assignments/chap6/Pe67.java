package assignments.chap6;

public class Pe67 {

	public static void main(String[] args) {
		int [] counts = new int [10];
		int number;
		for ( int i = 0; i < 100; i ++){
			number = (int)(Math.random() * 10);
			counts [number]++;
		}
		for (int j = 0; j < counts.length; j++){
			System.out.printf("The count for %d is : %d\n", j, counts[j]);
		}
		

	}

}
