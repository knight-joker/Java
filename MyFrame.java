package Day34;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultCaret;

public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
		
		JPanel k = new JPanel();
		this.setContentPane(k);
		JButton b = new JButton("猪佩奇好棒");
		MyControl c = new MyControl();
		k.add(c);
		k.add(b);
		((Component) c).setPreferredSize(new Dimension(120,120));
		
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("检测到鼠标点击");
				System.out.println("点击位置" + e.getPoint());
			
				if(e.getButton() == MouseEvent.BUTTON1) {
					System.out.println("点击的鼠标为左键");
				}else if(e.getButton() == MouseEvent.BUTTON2) {
					System.out.println("中键");
				}else if(e.getButton() == MouseEvent.BUTTON3) {
					System.out.println("右键");
				}
			}
			
		});
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("按钮被点击");
				
			}
		});
		b.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("猪佩奇加油");
			}
		});
	}
}
