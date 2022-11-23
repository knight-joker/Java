package Day32;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	public  MyFrame(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
		MyControl c = new MyControl();
		k.add(c);
		c.setPreferredSize(new Dimension(300,250));
		
	}
	
}