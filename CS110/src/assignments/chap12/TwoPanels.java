package assignments.chap12;

import java.awt.*;

import javax.swing.*;

public class TwoPanels extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setTitle("Exercise 12_1");
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(new JButton("Button1"));
		panel1.add(new JButton("Button2"));
		panel1.add(new JButton("Button3"));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.add(new JButton("Button4"));
		panel2.add(new JButton("Button5"));
		panel2.add(new JButton("Button6"));
		panel1.add(panel2);
		frame.add(panel1);
		frame.setSize(550, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
