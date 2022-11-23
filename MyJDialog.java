package Day32;

import java.awt.Container;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJDialog extends JDialog {
	public MyJDialog(MyFrame1 frame) {
		super(frame,"JAVA",true);
		Container container = getContentPane();
		container.add(new JLabel("JAVAC"));
		setBounds(120,120,100,100);
		frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
	}

}
