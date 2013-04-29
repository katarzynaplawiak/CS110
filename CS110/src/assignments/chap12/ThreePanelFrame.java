package assignments.chap12;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreePanelFrame extends JFrame {
	public ThreePanelFrame() {
		JPanel p1 = new ThreeButtonPanel("Button1", "Button2", "Button3");
		JPanel p2 = new ThreeButtonPanel("Button4", "Button5", "Button6");
		add(p2, BorderLayout.EAST);
		add(p1, BorderLayout.CENTER);

	}
}
