package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.*;

public class TestThreeButtonPanel {
	public static void main(String[] args) {
		JFrame newFrame = new ThreePanelFrame();
		newFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
		newFrame.setTitle("Extercise 12_4");
		newFrame.setSize(550, 80);
		newFrame.setLocationRelativeTo(null);
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setVisible(true);
	}

}
