package Day30;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyFrame3 extends JFrame{
	
	public  MyFrame3(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
		
		ColorLabel a1 =new ColorLabel("1",Color.YELLOW);
		ColorLabel a2 =new ColorLabel("2",Color.BLACK);
		ColorLabel a3 =new ColorLabel("3",Color.RED);
		ColorLabel a4 =new ColorLabel("4",Color.BLUE);
		k.add(a1);
		k.add(a2);
		k.add(a3);
		k.add(a4);		
	}
	
	private static class ColorLabel extends JLabel{
		public ColorLabel(String text,Color bgColor) {
			this.setText(text);
			
			setOpaque(true);
			this.setBackground(bgColor);
			this.setPreferredSize(new Dimension(60,30));
			this.setHorizontalAlignment(SwingConstants.CENTER);
			
		}
	}
}
