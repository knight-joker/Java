package Day33;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPicture extends JPanel{
	BufferedImage image;
	public MyPicture() {
		
		try {
			File file = new File("date/ai-pic1.jpg");
			System.out.println("打印一次");
			this.image = ImageIO.read(file);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	protected void paintComponent(Graphics g) {
		super.printComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.white);
		g.fillRect(0,0,width,height);
		
		g.drawImage(image, 0, 0, width, height,null);
	
		
		
		
	}


}
