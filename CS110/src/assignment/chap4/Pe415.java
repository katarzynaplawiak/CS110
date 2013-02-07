package assignment.chap4;

public class Pe415 {

	public static void main(String[] args) {
		int count = 0;
		final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
		char ch = '!';
		while (ch <='~'){
			count++;
			if (count % NUMBER_OF_CHARACTERS_PER_LINE == 0){
				System.out.println(ch);
			}
			else {
				System.out.print(ch + " ");
			ch++;
			
			}
			
		}

	}

}
