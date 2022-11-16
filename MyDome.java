package Day28;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyDome {
	public static void main(String args[]) {
		//JFrame指一个窗口，构造方法的参数为窗口标题
		//当关闭窗口时，退出整个程序（在Swing高级篇教程会介绍
		//MyJFrame frame = new MyJFrame("Java");
		JFrame frame = new MyJFrame("Example");//多态
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//设置窗口大小
		frame.setSize(400,300);
		
		//显示窗口
		frame.setVisible(true);
	}

}
