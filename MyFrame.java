package Day2;


import java.awt.Color;
import java.awt.image.ColorModel;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MyFrame extends JFrame{
	
	public  MyFrame(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
		Colorlabel a1 = new Colorlabel("1",Color.BLUE);
		Colorlabel a2 = new Colorlabel("1",Color.yellow);
		
		
		Border border1 = new LineBorder(Color.gray,4);
		a1.setBorder(border1);
		
		Border border2 = BorderFactory.createLineBorder(Color.red,4);
		a1.setBorder(border2);
		
	}

}
