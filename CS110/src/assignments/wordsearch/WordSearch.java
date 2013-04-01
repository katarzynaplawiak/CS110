package assignments.wordsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordSearch {

	private Scanner scanner;
	private String[] horizView;
	private Puzzle puzzle;
	private String[] reverseHorizView;
	private String[] vertView;
	private String[] vertReverseView;
	private WordVector wordVector;

	public WordSearch(File fileName) {

		try {

			scanner = new Scanner(fileName);

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public void solvePuzzle() {

		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		puzzle = new Puzzle(rows, columns);
		horizView = new String[rows];
		ArrayList<String> wordsToFind = new ArrayList<String>();

		System.out
				.println("Welcome to Word Search Puzzle!\n\nThis is your puzzle: ");
		for (int i = 0; i < rows; i++) {
			horizView[i] = scanner.next();
		}
		printArray(horizView);
		while (scanner.hasNext()) {
			wordsToFind.add(scanner.next());
		}
		reverseHorizView = makeReverseHorizView();
		vertView = makeVertView();
		vertReverseView = makeVertReverseView();
		puzzle.fillIn2DArray(horizView);

		System.out.println("Here are the words to find: ");

		for (int i = 0; i < wordsToFind.size(); i++) {
			System.out.print(wordsToFind.get(i) + " ");
		}
		System.out.println("\n\nSolution: ");
		puzzle.printPuzzle();
		for (int i = 0; i < wordsToFind.size(); i++) {
			String word = wordsToFind.get(i);
			play(word);

		}
		System.out.println("\nThanks for playing! ");
	}

	public String[] makeReverseHorizView() {
		reverseHorizView = new String[horizView.length];
		for (int i = 0; i < horizView.length; i++) {
			StringBuffer s = new StringBuffer();
			s.append(horizView[i]);
			reverseHorizView[i] = s.reverse().toString();
		}
		return reverseHorizView;

	}

	public String[] makeVertView() {
		vertView = new String[horizView[0].length()];
		for (int col = 0; col < horizView[0].length(); col++) {
			StringBuffer b = new StringBuffer();
			for (int row = 0; row < horizView.length; row++) {
				b.append(horizView[row].charAt(col));
			}
			vertView[col] = b.toString();
		}
		return vertView;
	}

	public String[] makeVertReverseView() {
		vertReverseView = new String[horizView[0].length()];

		for (int col = 0; col < horizView[0].length(); col++) {
			StringBuffer c = new StringBuffer();
			for (int row = 0; row < horizView.length; row++) {
				c.append(horizView[row].charAt(col));
			}
			vertReverseView[col] = c.reverse().toString();
		}
		return vertReverseView;
	}

	public void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public WordVector horizontalLookup(String s) {
		WordVector finalVector;
		finalVector = null;
		for (int i = 0; i < horizView.length; i++) {
			int index = horizView[i].indexOf(s);

			if (index != -1) {
				finalVector = new WordVector(i, index, Direction.EASTERLY,
						s.length());
			}
		}
		return finalVector;
	}

	public WordVector horizontalReverseLookup(String s) {
		WordVector finalVector;
		finalVector = null;
		for (int i = 0; i < reverseHorizView.length; i++) {
			int indexOfReverse = reverseHorizView[i].indexOf(s);
			if (indexOfReverse != -1) {
				int verifiedIndex = reverseHorizView[i].length() - 1
						- indexOfReverse;
				finalVector = new WordVector(i, verifiedIndex,
						Direction.WESTERLY, s.length());
				break;
			}
		}
		return finalVector;
	}

	public WordVector verticalLookup(String s) {

		WordVector finalVector;
		finalVector = null;
		for (int j = 0; j < vertView.length; j++) {
			int index = vertView[j].indexOf(s);
			if (index != -1) {

				finalVector = new WordVector(index, j, Direction.SOUTHERLY,
						s.length());
				break;

			}
		}
		return finalVector;

	}

	public WordVector verticalReverseLookup(String s) {
		WordVector finalVector;
		finalVector = null;
		for (int j = 0; j < vertReverseView.length; j++) {
			int indexOfReverse = vertReverseView[j].indexOf(s);
			if (indexOfReverse != -1) {

				int verifiedIndex = vertReverseView[j].length() - 1
						- indexOfReverse;
				finalVector = new WordVector(j, verifiedIndex,
						Direction.NORTHERLY, s.length());
				break;
			}
		}
		return finalVector;
	}

	public WordVector lookup(String s) {
		WordVector solVector;
		solVector = null;
		if (horizontalLookup(s) != null) {
			solVector = horizontalLookup(s);
		} else if (horizontalReverseLookup(s) != null) {
			solVector = horizontalReverseLookup(s);
		} else if (verticalLookup(s) != null) {
			solVector = verticalLookup(s);
		} else if (verticalReverseLookup(s) != null) {
			solVector = verticalReverseLookup(s);
		}

		return solVector;
	}

	public void play(String s) {
		wordVector = lookup(s);
		if (wordVector == null) {
			System.out.println(s + " not found in the puzzle");
		} else {
			String vectorString = wordVector.toString();
			System.out.println(s + " found at " + vectorString);
			puzzle.placeAsterisks(wordVector);
			puzzle.printPuzzle();

		}

	}

}
