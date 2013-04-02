package assignment.chap8;

public class Location {

	public int row;
	public int column;
	public double maxValue;

	Location() {

	}

	public static Location locateLargest(double[][] array) {
		Location location = new Location();
		double maxValue = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
					location.maxValue = maxValue;
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;

	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public double getMaxValue() {
		return maxValue;
	}
}
