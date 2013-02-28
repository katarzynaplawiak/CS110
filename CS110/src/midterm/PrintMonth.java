package midterm;

public class PrintMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMonth (5, 31);
		printMonth(2, 28);
		printMonth(6, 30);

	}
	public static void printMonth (int startDay, int dayInMonth){
		String [] days = {"Sun","Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		
		
		for (int i =0; i< days.length; i++){
			System.out.print(days[i]+ " ");
		}
		System.out.println();
	
		for (int j = 0; j< 35; j++){
			int count = 0;
			for (int k =0; k<(35-dayInMonth);k++ ){
				System.out.printf("%4s", " ");
				count++;
			
			
			for (int i = 1; i<=dayInMonth; i++){
			System.out.printf("%4d", i);
		}
			System.out.println();
			
			}
		}
	}
}


