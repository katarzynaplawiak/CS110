package assignments.chap12;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class TestDisplayWordSearch {
	public static void main(String[] args) {
		JFrame frame = new DisplayWordSearch();
		frame.setLayout(new GridLayout(4, 1, 5, 5));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		

	}
}
