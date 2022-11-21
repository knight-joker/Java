package Day30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	
	public  MyFrame2(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		JComboBox<String> colorField = new JComboBox();
		k.add(colorField);
		//
		colorField.addItem("红");
		colorField.addItem("绿");
		colorField.addItem("蓝");
		
		//添加一个按钮
		JButton button = new JButton("测试");
		k.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				test();
			}

			private void test() {
				int index = colorField.getSelectedIndex();
				System.out.println("用户选中的项：" + index);
				int count = colorField.getItemCount();
				String value = colorField.getItemAt(0);
				System.out.println(count + value);
				
			}
		});
	}
}