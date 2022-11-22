package Day31;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MyFrame1 extends JFrame{
	public  MyFrame1(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		k.setLayout(null);
		
	
		
		ColorLabel a1 =new ColorLabel("1",Color.YELLOW,100,100);
		k.add(a1);
		a1.setBounds(0, 0, 100, 50);

	}

	private static class ColorLabel extends JLabel{
		public ColorLabel(String text,Color bgColor,int a,int b) {
			this.setText(text);
			
			setOpaque(true);
			this.setBackground(bgColor);
			this.setHorizontalAlignment(SwingConstants.CENTER);
			this.setPreferredSize(new Dimension(a,b));
			
			
			
		}
	}
	
}


