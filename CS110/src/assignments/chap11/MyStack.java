package assignments.chap11;

import java.util.ArrayList;

public class MyStack<String> extends ArrayList<String> {
	MyStack() {
		super();
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.size();
	}

	public String peek() {
		return super.get(super.size() - 1);
	}

	public String pop() {
		String last = super.get(super.size() - 1);
		super.remove(last);
		return last;
	}

	public void push(String s) {
		super.add(s);
	}

	@Override
	public java.lang.String toString() {
		return "MyStack " + super.toString();
	}
}
