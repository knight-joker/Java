package Day30;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyDome {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame("百度一下");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
	}

}