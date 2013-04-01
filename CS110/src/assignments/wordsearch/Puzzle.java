package assignments.wordsearch;

public class Puzzle {

	private char[][] array;

	Puzzle(int rows, int columns) {
		this.array = new char[rows][columns];

	}

	public void placeAsterisks(WordVector vector) {
		int vectorRow = vector.getRow();
		int vectorColumn = vector.getCol();
		int length = vector.getLength();
		Direction d = vector.getDirection();
		for (int i = 0, rowStep = vectorRow, columnStep = vectorColumn; i < length; rowStep += d
				.getVerticalStep(), columnStep += d.getHorizontalStep(), i++) {
			array[rowStep][columnStep] = '*';
		}
	}

	public void printPuzzle() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public void fillIn2DArray(String[] stringArray) {

		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < stringArray[i].length(); j++) {
				array[i][j] = stringArray[i].charAt(j);
			}
		}
	}
}
