package 贪吃蛇;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameUtils {
	
	//获取图片
	//蛇头有四个方向所以加四张方向不一样的图
	public static Image upImg = Toolkit.getDefaultToolkit().getImage("img/up.png");
	public static Image downImg = Toolkit.getDefaultToolkit().getImage("img/down.png");
	public static Image rightImg = Toolkit.getDefaultToolkit().getImage("img/right.png");
	public static Image leftImg = Toolkit.getDefaultToolkit().getImage("img/left.png");
	//蛇的身体
	public static Image bodyImg = Toolkit.getDefaultToolkit().getImage("img/body.png");
	//食物
	public static Image foodImg = Toolkit.getDefaultToolkit().getImage("img/food.png");
	
	
	public static void drawWord(Graphics g,String str,Color color,int size,int x,int y) {//设置一个方法来绘制文字
		
		g.setColor(color);//设置颜色
		
		g.setFont(new Font("仿宋",Font.BOLD,size));//设置字体 仿宋，粗体，
		
		g.drawString(str,x,y);//将字体投影到窗口
		
	}
}
