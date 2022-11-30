package 贪吃蛇;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class HeadObj extends GameObj{
	private String direction = "right";//定义方向  up right down left
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public HeadObj(Image image,int x,int y, GameWin frame) {
		super(image,x,y,frame);
		this.frame.addKeyListener(new KeyAdapter() {//添加键盘监听器监听键盘
			public void keyPressed(KeyEvent e) {
				changeDirection(e);//获取键盘输入	
			}
		});
	}
	public void  changeDirection(KeyEvent e) {//控制蛇的移动方向 w a s d 上下左右
		switch(e.getKeyCode()) {
		case KeyEvent.VK_A:
			if(!"right".equals(direction)) {//判断蛇的方向，蛇不能反方向移动
				direction = "left";
				image = GameUtils.leftImg;
			}
			break;
		case KeyEvent.VK_D:
			if(!"left".equals(direction)) {
				direction = "right";
				image = GameUtils.rightImg;
			}
			break;
		case KeyEvent.VK_W:
			if(!"down".equals(direction)) {
				direction = "up";
				image = GameUtils.upImg;
			}
			break;
		case KeyEvent.VK_S:
			if(!"up".equals(direction)) {
				direction = "down";
				image = GameUtils.downImg;
			}
			break;
			default:
				break;
		}
	}
	public void move() {//蛇的移动
		List<Bodyobj> bodyobjList = this.frame.bodyobjList;//蛇身体的移动
		for(int i = 1;i<bodyobjList.size();i++) {
			bodyobjList.get(i).x = bodyobjList.get(i-1).x;
			bodyobjList.get(i).y = bodyobjList.get(i-1).y;
		}
		bodyobjList.get(0).x = this.x;
		bodyobjList.get(0).y = this.y;
		
		switch(direction) {//switch判断方向 蛇头移动
		case"up":
			y -= height;
			break;
		case"down":
			y += height;
			break;
		case"left":
			x -= width;
			break;
		case"right":
			x += width;
			default:
				break;
			
		}
		
	}
	public void paintSelf(Graphics g) {
		// TODO 自动生成的方法存根
		super.paintSelf(g);
		move();
		if(x<0) {//越界处理
			x = 570;
		}else if(x>570) {
			x = 0;
		}else if(y<30) {
			y = 570;
		}else if(y>570) {
			y = 30;
		}
	}
	
	
	}
