package assignments.chap9;

public class MyString1 {
	private char[] array;

	public MyString1(char[] chars) {
		this.array = chars;
	}

	public char charAt(int index) {
		return array[index];
	}

	public int length() {
		return array.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] newArray = new char[end - begin];
		for (int i = begin, j = 0; i < end; i++, j++) {
			newArray[j] = this.array[i];
		}
		MyString1 newMyString1 = new MyString1(newArray);
		return newMyString1;
	}

	public MyString1 toLowerCase() {
		char[] newArray = new char[this.array.length];
		for (int i = 0; i < this.array.length; i++) {
			newArray[i] = Character.toLowerCase(this.array[i]);
		}
		MyString1 newMyString1 = new MyString1(newArray);

		return newMyString1;

	}

	public boolean equals(MyString1 s) {
		boolean result = false;
		for (int i = 0; i < this.array.length; i++) {
			result = (this.array[i] == s.array[i]) ? true : false;
			if (result == false) {
				break;
			}
		}
		return result;

	}

	public static MyString1 valueOf(int i) {
		char[] array1 = new char[1];
		char c1 = Character.forDigit(i, 10);
		array1[0] = c1;
		MyString1 newString1 = new MyString1(array1);
		return newString1;
	}

	public String toString() {
		String s = new String(this.array);
		return s;
	}
}
