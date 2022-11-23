package Day32;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Sin extends JPanel{
	public int grain = 1; //粒度为3
	public int radius = 50;//高度（振幅）
	public int period = 100;//x轴，每100像素表示一个周期
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		 
		int width = this.getWidth();
		int height = this.getHeight();
		g.setColor(new Color(255,255,255,255));
		g.fillRect(0, 0, width, height);
		
		int center = height/2;
		g.setColor(Color.BLUE);
		g.drawLine(0, center, width, center);
		
		
		
		
		///////////////////////////////////////////
		int x1 = 0;
		int y1 = 0;
		for(int i=0;i<width;i+=grain) {
			int x2 = i;
			double angle = 2*Math.PI*x2/period;
			int y2  = (int) (radius*Math.sin(angle));
			
			g.drawLine(x1, center+y1, x2, y2+center);
			x1 = x2;
			y1 = y2;
		}
		
		
	}
	public static void main(String args[]) {
	}
}
