package assignments.chap12;

import javax.swing.*;

public class ThreeButtonPanel extends JPanel {
	public ThreeButtonPanel(String text1, String text2, String text3) {

		add(new JButton(text1));
		add(new JButton(text2));
		add(new JButton(text3));

	}
}
