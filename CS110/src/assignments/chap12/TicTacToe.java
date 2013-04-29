package assignments.chap12;

import java.awt.*;
import javax.swing.*;

public class TicTacToe extends JFrame {
	ImageIcon xIcon = new ImageIcon("C:/Users/Kasia/Pictures/x.gif");
	ImageIcon oIcon = new ImageIcon("C:/Users/Kasia/Pictures/o.gif");

	public TicTacToe() {

		setLayout(new GridLayout(3, 3, 5, 5));
		for (int i = 0; i < 9; i++) {
			int num = (int) (Math.random() * 2);
			if (num == 0) {
				add(new JLabel(xIcon));
			} else {
				add(new JLabel(oIcon));

			}
		}
	}
}
