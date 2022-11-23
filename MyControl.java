package Day32;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyControl extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = this.getWidth();
		int height = this.getHeight();
		
		g.setColor(new Color(255,255,255,255));
		g.fillRect(0,0,width,height);
		g.setColor(new Color(0,0,255));
		g.fillRect(50,50,60,60);
		
		g.setColor(Color.RED);
		g.fillRect(30,30,50,20);
		
		g.setColor(Color.black);
		g.fillOval(100, 100, 100, 100);
		
		g.setColor(Color.black);
		g.drawRect(30, 30, 50, 50);
	}


}
