package Day32;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame1 extends JFrame {
	public static void main(String args[]) {
		new MyFrame1();
		
	}
	public MyFrame1() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("JAVA!");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(MyFrame1.this).setVisible(true);
				}
				
			});
		container.add(bl);
		}

}
