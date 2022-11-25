package kswing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	public  MyFrame(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);	
		PIctureView c = new PIctureView();
		k.add(c);
		c.setPreferredSize(new Dimension(200,200));
		c.setBackground(Color.yellow);
		c.setImage("res/ai-pic1.jpg");
	}
	
}