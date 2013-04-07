package assignments.chap9;

public class Hangman {
	private String[] words = { "spring", "calculator", "holidays",
			"programming", "mountain", "cupcake", "chocolate", "universe" };
	private String s1;
	private StringBuffer s2;
	private int count;

	Hangman() {

		this.s1 = words[(int) (Math.random() * words.length)];
		this.s2 = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			s2.append("*");
		}

	}

	public void replaceAstrerisks(String c) {
		int index;
		if ((s2.toString()).indexOf(c) >= 0) {
			System.out.println(c + " is already in the word");
		} else if (s1.indexOf(c) == -1) {
			System.out.println(c + " is not in the word");
			increaseMisses();
		} else {
			index = s1.indexOf(c);
			s2.deleteCharAt(index);
			s2.insert(index, c);
			for (int i = index; i < s1.length(); i++) {
				int index2 = s1.indexOf(c, i);
				if (index2 != -1) {
					s2.deleteCharAt(index2);
					s2.insert(index2, c);
				} else {
					break;
				}
			}
		}

	}

	public void increaseMisses() {
		this.count++;
	}

	public String getWord() {
		return s1;
	}

	public String getCurrentView() {
		return s2.toString();
	}

	public int getCount() {
		return count;
	}

	public boolean isUnsolved() {
		return (getCurrentView().indexOf('*') >= 0);
	}

}
