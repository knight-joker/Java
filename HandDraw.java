package day35;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class HandDraw extends JPanel {
	
	private boolean pressed  = false;
	private List<Point> points = new ArrayList<>();
	public HandDraw() {
		MyMouseListener l = new MyMouseListener();
		this.addMouseMotionListener(l);
		this.addMouseListener(l);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		g.setColor(Color.blue);
		g.fillRect(0, 0, width, height);
		
			g.setColor(Color.BLACK);
			g.drawRect(0,0,width-1,height-1);
			
			if(points.size()>=2) {
				//设置线条颜色
				g.setColor(Color.white);			
				//开始绘制,连接点
				Point p1 = points.get(0);
				//for循环从1开始
				for(int i= 1;i<points.size();i++) {
					Point p2 = points.get(i);
					g.drawLine(p1.x,p1.y,p2.x,p2.y);
					p1 = p2;
				}
			}
		}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			pressed  = true;
			points.clear();//开始的时候一个清空原来的数据
			points.add(e.getPoint());//记录鼠标的位置

		}

		@Override
		public void mouseReleased(MouseEvent e) {
	
			pressed = false;
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			if(pressed) {
				points.add(e.getPoint());
				repaint();//重绘
			}
		}

		
	}
}
