package 贪吃蛇;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class GameWin extends JFrame{ 
	
	HeadObj headobj = new HeadObj(GameUtils.rightImg, 30, 570, this); //创建蛇头对象
	public List<Bodyobj> bodyobjList = new ArrayList<>();//添加蛇身对象集合
	public void launch() {
		
		this.setVisible(true);//设置窗口可见
		
		this.setSize(600,600);//设置窗口大小
		
		this.setLocationRelativeTo(null);//设置屏幕居中
		
		this.setTitle("k的贪吃蛇");//设置窗口标题
		
		bodyobjList.add(new Bodyobj(GameUtils.bodyImg,30,570,this));//对蛇的身体初始化
	    bodyobjList.add(new Bodyobj(GameUtils.bodyImg,0,570,this));
		while(true) {
			repaint();
			try {
				Thread.sleep(200);//1秒=1000毫秒
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}//1秒=1000毫秒
		}
	}
	
	
	public void paint(Graphics g) {//重写paint方法
		
		g.setColor(Color.gray);//设置背景颜色为灰色
		
		g.fillRect( 0, 0, 600, 600);//绘制网格线
		g.setColor(Color.red);//设置网格线的颜色为红色
		
		for(int i = 0;i<20;i++) {//利用for循环批量实现网格线的绘制    规定每一个网格大小为30*30
			g.drawLine(0, i*30, 600, i*30);//绘制横线
			g.drawLine(i*30, 0, i*30, 600);//绘制竖线
		}
		
		for(int i= bodyobjList.size();i>=0;i--){//绘制蛇的身体
			bodyobjList.get(i).paintSelf(g);
		}
		
		headobj.paintSelf(g);
		
	}


	public static void main(String args[]) {
		
		GameWin gamewin = new GameWin();//实例化方法
		gamewin.launch();//调用launch方法
		
	}
	

}
