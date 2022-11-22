package Day31;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class MyFrame2 extends JFrame{
	public  MyFrame2(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
		k.setLayout(new MyLayout());
		ColorLabel a1 =new ColorLabel("1",Color.YELLOW,100,100);
		ColorLabel a2 =new ColorLabel("2",Color.BLACK,100,100);
		ColorLabel a3 =new ColorLabel("3",Color.RED,100,100);
		ColorLabel a4 =new ColorLabel("4",Color.BLUE,100,100);
		ColorLabel a5 =new ColorLabel("5",Color.WHITE,100,100);
		
		k.add(a1);
		k.add(a2);
		k.add(a3);
		k.add(a4);
		k.add(a5);
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


