package Day28;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJFrame extends JFrame{
	public MyJFrame(String title) {
		
		super(title);
	
		//设置标题
		this.setTitle("My Java");
	
		
		//创建一个容器
		JPanel root = new JPanel();
		this.setContentPane(root);
		
		//创建一个按钮
		JButton button = new JButton("Test");//按钮的显示
		root.add(button);
		//
				
		root.add(new JLabel("你好Java"));
		//
		JLabel label =new JLabel("Java你好");
		root.add(label);
	}

}
