package Day32;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	
	public  MyFrame2(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
		Sin s = new Sin();
		k.add(s);
		s.setPreferredSize(new Dimension(1000,1000));
	}
	
}