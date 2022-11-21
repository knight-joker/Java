package Day30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JTextField textfield = new JTextField(20);
//	JTextField textfield2 = new JTextField(20);

	public MyFrame(String title) {
		super(title);
		JPanel root = new JPanel();
		this.setContentPane(root);
		
//		String str = textfield2.getText();
		root.add(textfield);
//		root.add(textfield2);
//		textfield.setText(str);
		textfield.setText("JAVA");
		
		JButton button = new JButton("搜索");
		root.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			test();
			}
		});
		
		
	}
	public void test() {
		String str = textfield.getText();
		System.out.println(str);
	}
	public void setDefaultLookAndFeelDecorated(int exitOnClose) {
		// TODO 自动生成的方法存根
		
	}
	
}

