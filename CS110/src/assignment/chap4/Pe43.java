package assignment.chap4;

public class Pe43 {

	public static void main(String[] args) {
		final double POUNDS_IN_KILOGRAM = 2.2;
		System.out.printf("%s" + "%13s", "Kilograms", "Pounds");
		double pounds = 0;
		for ( int i = 1; i<=199; i+=2){
			pounds = i * POUNDS_IN_KILOGRAM;
			System.out.printf("\n %-3d %15.1f", i,pounds);
		}
	System.out.println();
	}

}
