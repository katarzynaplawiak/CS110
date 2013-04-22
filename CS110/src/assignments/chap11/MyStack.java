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
		return get(getSize() - 1);
	}

	public Object pop() {
		Object last = get(getSize() - 1);
		super.remove(getSize() - 1);
		return last;
	}

	public Object push(Object s) {
		super.add(s);
		return s;
	}

	@Override
	public String toString() {
		return "MyStack " + super.toString();
	}
}
