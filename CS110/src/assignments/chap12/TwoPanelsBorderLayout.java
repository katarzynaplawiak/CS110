package assignments.chap12;

import java.awt.*;

import javax.swing.*;

public class TwoPanelsBorderLayout extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Exercise 12_1");
		JPanel panel1 = new JPanel(new FlowLayout());
		panel1.add(new JButton("Button1"));
		panel1.add(new JButton("Button2"));
		panel1.add(new JButton("Button3"));
		JPanel panel2 = new JPanel(new FlowLayout());
		panel2.add(new JButton("Button4"));
		panel2.add(new JButton("Button5"));
		panel2.add(new JButton("Button6"));
		frame.add(panel1, BorderLayout.SOUTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setSize(280, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}