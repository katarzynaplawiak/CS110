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
		StringBuffer word2 = new StringBuffer();
		word2.append(s2);
		if (s1.length() == s2.length())
			for (int i = 0; i < s1.length(); i++) {
				int index = word2.toString().indexOf(s1.charAt(i));
				if (index >= 0) {
					result = true;
					word2.deleteCharAt(index);
				} else {
					result = false;
					break;
				}
			}
		return result;

	}

}
