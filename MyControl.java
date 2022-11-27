package Day34;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyControl extends JPanel {
	private boolean hover = false;
	public MyControl() {
		this.addMouseListener(new MyMouseListener());
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		
		if(hover) {
			g.setColor(Color.red);
			g.drawRect(0,0,width-1,height-1);
		}else {
			g.setColor(Color.BLACK);
			g.drawRect(0,0,width-1,height-1);
		}
	}
	private class MyMouseListener extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("鼠标进入");
			hover = true;
			repaint();
		
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("鼠标出去");
			hover = false;
			repaint();
		}
		
	}
}
