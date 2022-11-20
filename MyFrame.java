package Day29;

//导包
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	//创建时间属性
	JLabel timeLabel = new JLabel("00:00:00");//显示时间
	public MyFrame(String title) {
		super(title);//调用父类标题
		
		JPanel root =new JPanel();
		this.setContentPane(root);
	
		root.add(timeLabel);
		
		JButton button = new JButton("Time");
		root.add(button);//创建按钮
		
		//ActionListener listener = new MyActionListener();
		//button.addActionListener(listener);
		button.addActionListener(new MyActionListener());//简化 实例化方法ActionListener
	}
	
	private class MyActionListener implements ActionListener{//引入接口

		@Override
		public void actionPerformed(ActionEvent e) {//创建接口
			
			System.out.println("-JAVA-");
			
			SimpleDateFormat sdf = new SimpleDateFormat("HHH:mm:ss");
			String timestr = sdf.format(new Date());
			System.out.println(timestr);
			timeLabel.setText(timestr);
		}
		
	}


}
