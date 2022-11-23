package Day32;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Examplel extends JFrame{
	public void CreateJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();//获取一个容器
		JLabel jl = new JLabel("JAVA"); //创建一个JLabel标签
		jl.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
		
		container.add(jl);
		container.setBackground(Color.BLUE);
		jf.setVisible(true);
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new Examplel().CreateJFrame("JAVA");
	}

}
