package assignments.keyListener;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class KeyListenerUsage extends JFrame {
	KeyListenerUsage() {
		JPanel p = new JPanel();
		p.setBorder(new TitledBorder("Press a button"));
		JTextField tField = new JTextField(10);
		tField.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println("Key pressed: " + arg0.getKeyChar());

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {

			}

		});
		p.add(tField);
		p.setFocusable(true);
		add(p);
	}

	public static void main(String[] args) {
		JFrame frame = new KeyListenerUsage();
		frame.setSize(300, 100);
		frame.setTitle("KeyListenerUsage");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
