package assignments.wordsearch;

public class Puzzle {

	private char[][] array;
	private int vectorRow;
	private int length;
	private Direction d;
	private int vectorColumn;
	

	Puzzle(int rows, int columns) {
		array = new char[rows][columns];

	}

	public void placeAsterisks(WordVector vector) {
		vectorRow = vector.getRow();
		vectorColumn = vector.getCol();
		length = vector.getLength();
		d = vector.getDirection();
		for (int i = 0, rowStep = vectorRow, columnStep = vectorColumn; i < length; rowStep += d
				.getVerticalStep(), columnStep += d.getHorizontalStep(), i++) {
			array[rowStep][columnStep] = '*';
		}
	}
	public void printPuzzle(){
		for (int i = 0; i< array.length; i++){
			for (int j = 0; j< array[i].length; j++){
				System.out.print(array [i][j]);
			}
			System.out.println();
		}
	}
	public void fillIn2DArray (String [] stringArray){
		
		for( int i = 0; i< stringArray.length; i++){
			for (int j =0; j< stringArray[i].length(); j++){
				array[i][j]= stringArray[i].charAt(j);
			}
		}
	}
}
