package assignments.chap9;

import java.util.Scanner;

public class Pe912 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the words to check for an anagram : ");
		String word1 = input.next();
		String word2 = input.next();
		System.out.println("Two strings are "
				+ (isAnagram(word1, word2) ? "anagrams" : "not anagrams"));

	}

	public static boolean isAnagram(String s1, String s2) {
		boolean result = false;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s2.indexOf(s1.charAt(i)) >= 0) {
					result = true;
				}
			}

		}
		return result;
	}

}
