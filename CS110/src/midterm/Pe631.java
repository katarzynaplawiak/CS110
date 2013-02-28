package midterm;

import java.util.Scanner;
import java.util.ArrayList;

public class Pe631 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter the lenght of the first list: ");
	int list1Length = input.nextInt();
	System.out.print("Enter the lenght of the second list: ");
	int list2Length= input.nextInt();
	System.out.print("Enter sorted list 1: ");
	int[] list1 =new int  [list1Length];
	int [] list2 = new int [list2Length];
	for (int i = 0; i<list1Length; i++){
		int number = input.nextInt();
		list1[i]= number;
	}
	System.out.println("Enter sorted list 2: ");
	for(int i = 0; i< list2Length; i++){
		list2[i]= input.nextInt();
	}
	
		
		
	
		
	}

	

	
	public static int[] merge (int [] list1, int [] list2){
		
	int [] newArray = new int[list1.length + list2.length];
	System.arraycopy(list1, 0, newArray, 0, list1.length);
	
	int second = list1.length -1;
	System.arraycopy(list2, 0, newArray,second,list2.length);
	
	java.util.Arrays.sort(newArray);	
	
	return newArray;
	}
	
		
	}

}
