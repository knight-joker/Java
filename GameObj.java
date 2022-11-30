package 贪吃蛇;

import java.awt.Graphics;
import java.awt.Image;

public class GameObj {
	
	Image image;//图片
	
	int x,y;//坐标
	
	int width = 30,height = 30;//物体的宽高
	
	GameWin frame;//进行窗口的引用

	
	//生成get set 方法 
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public GameWin getFrame() {
		return frame;
	}

	public void setFrame(GameWin frame) {
		this.frame = frame;
	}
	
	public GameObj() {
	}
	

	/**    有参构造
	 * @param image
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param frame
	 */
	public GameObj(Image image, int x, int y, GameWin frame) {
		super();
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.frame = frame;
	}

	/**   有参构造和无参构造
	 * @param image
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param frame
	 */
	public GameObj(Image image, int x, int y, int width, int height, GameWin frame) {
		super();
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.frame = frame;
	}
	
	public void paintSelf(Graphics g) { //定义物体绘制自身的方法
		g.drawImage(image,x,y,null);
	}
}
