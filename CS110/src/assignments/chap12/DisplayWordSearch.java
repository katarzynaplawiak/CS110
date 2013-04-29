package assignments.chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayWordSearch extends JFrame{
public DisplayWordSearch(){
	File wordSearch = new File ("wordSearch.txt");
	Scanner input = null;
	try {
		input = new Scanner(wordSearch);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while(input.hasNext()){
		String element = input.next();
		JPanel panel = new JPanel();
		panel.add(new JLabel(element));
		add(panel);
	}
}
}
