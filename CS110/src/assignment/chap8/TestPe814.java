package assignment.chap8;

import java.util.Random;

public class TestPe814 {

	public static void main(String[] args) {
		int array[] = new int[100000];
		Random random1 = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random1.nextInt();
		}

		StopWatch count1 = new StopWatch();
		count1.start();

		for (int i = 0; i < array.length; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
		count1.stop();
		System.out.println("Execution time: " + count1.getElapsedTime()
				+ " milliseconds");

	}

}
