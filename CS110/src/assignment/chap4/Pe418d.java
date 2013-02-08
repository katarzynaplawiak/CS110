package assignment.chap4;

public class Pe418d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <=n; i++){
			for (int j = 1; j <= (i - 1); j++){
				System.out.print("  ");
			}
			for (int j = 1; j<=(n+1)-i; j++){
				System.out.print(j+ " ");
			}
			
			System.out.println();
			}
	}
}
