package assignments.wordsearch;

public class WordVector {
	private int row;
	private int col;
	private Direction direction;
	private int length;

	public WordVector(int r, int c, Direction d, int l) {
		row = r;
		col = c;
		direction = d;
		length = l;
	}

	public int getCol() {
		return col;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getLength() {
		return length;
	}

	public int getRow() {
		return row;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("[row = ");
		sb.append(String.valueOf(getRow()));
		sb.append(", col = ");
		sb.append(String.valueOf(getCol()));
		sb.append("] in ");
		sb.append(getDirection().toString());
		sb.append(" of length ");
		sb.append(String.valueOf(getLength()));
		return sb.toString();

	}

}
