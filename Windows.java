package Day28;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Windows {
	public static void main(String args[]) {
		//JFrame指一个窗口，构造方法的参数为窗口标题
		JFrame frame = new JFrame("Windows");
		
		//当关闭窗口时，退出整个程序（在Swing高级篇教程会介绍
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("My Java");
		//设置标题
		
		//创建一个容器
		JPanel root = new JPanel();
		frame.setContentPane(root);
		
		//创建一个按钮
		JButton button = new JButton("Test");//按钮的显示
		root.add(button);
		
		//设置窗口大小
		frame.setSize(400,300);
		
		//显示窗口
		frame.setVisible(true);
	}

}
