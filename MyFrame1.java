package Day30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame{
	JButton nextButton = new JButton("同意");
	JCheckBox agreeField  = new JCheckBox("陆珍是猪");
	public  MyFrame1(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		
	
		k.add(agreeField);
		//下一步按钮
	
		k.add(nextButton);
		//界面初始化
		agreeField.setSelected(false);
		
		
		//给caheckbox添加事件处理
		agreeField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(agreeField.isSelected())
					nextButton.setEnabled(true);
				else
					nextButton.setEnabled(false);
			}
		});
		
		
	}
	
}
