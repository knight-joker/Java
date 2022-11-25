package kswing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PIctureView extends JPanel{
	private Image image;
	private Color bgColor;
	public PIctureView() {   
	}
	public  void setBackgroundColor(Color color) {
		this.bgColor = color;
		this.repaint();
	}
	public void setImage(Image image) {
		this.image = image;
		this.repaint();
	}
	public void setImage(File file) {
		try {
			this.image  = ImageIO.read(file);
			this.repaint();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setImage(String resourcePath) {
		try {
			InputStream res = this.getClass().getResourceAsStream(resourcePath);
			this.image = ImageIO.read(res);
			this.repaint();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void paintComponent(Graphics g) {
		super.printComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		if(bgColor !=null) {
			g.setColor(bgColor);
			g.fillRect(0,0,width,height);
		}
		g.setColor(Color.white);
		g.fillRect(0,0,width,height);
		
		g.drawImage(image, 0, 0, width, height,null);
	
		
		
		
	}


}
