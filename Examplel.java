package Day28;

import java.awt.*;

import javax.swing.*;

public class Examplel extends JFrame {
	public void CreateJframe(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel();jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200,150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String args[]) {
		new Examplel().CreateJframe("创建一个JFrame窗体");
	}

}
