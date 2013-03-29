package assignments.wordsearch;

import java.io.File;
import java.util.Scanner;

public class TestWordSearch {

	public static void main(String[] args) {
		File file = new File(args[0]);
		WordSearch search = new WordSearch(file);
		search.solvePuzzle();

	}
}