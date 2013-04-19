package assignments.chap11;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
	MyStack() {
		super();
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.size();
	}

	public Object peek() {
		return super.get(super.size() - 1);
	}

	public Object pop() {
		Object last = super.get(super.size() - 1);
		super.remove(last);
		return last;
	}

	public void push(Object s) {
		super.add(s);
	}

	@Override
	public String toString() {
		return "MyStack " + super.toString();
	}
}
