package assignments.chap9;

public class TestMyString1 {

	public static void main(String[] args) {
		char[] chars = { 'a', 'B', 'c', 'D' };
		MyString1 s = new MyString1(chars);
		System.out.println("First character : " + s.charAt(0));
		System.out.println("The object's length is " + s.length());
		System.out.println("Two first elements are : " + s.substring(0, 2));
		System.out.println("Characters to lowercase : " + s.toLowerCase());
		char[] chars2 = { 'q', 'w', 'e', 'r', 't', 'y' };
		MyString1 s2 = new MyString1(chars2);
		System.out.println("s equals s2? " + s.equals(s2));
		MyString1 s3 = MyString1.valueOf(8);
		System.out.println(s3.toString());

	}

}
