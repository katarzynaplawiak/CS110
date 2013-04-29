package assignments.chap12;

import javax.swing.*;

public class TestTicTacToe {

	public static void main(String[] args) {
		JFrame frame = new TicTacToe();
		frame.setTitle("Tic-Tac-Toe");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
