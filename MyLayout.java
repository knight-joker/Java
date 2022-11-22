package Day31;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public class MyLayout implements LayoutManager2{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
	
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		int width = parent.getWidth();
		int height = parent.getHeight();
		Component[] children = parent.getComponents();	
		
		int x = 0;
		int y = 0;
		for(int i = 0;i<children.length;i++) {
			Component c = children[i];
			c.setBounds(x,y,100,100);
			
			x+=100;
			if(x>width) {
				x=0;
				y+=100;
			}
		}
	}

	@Override
	public void addLayoutComponent(Component comp, Object constraints) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Dimension maximumLayoutSize(Container target) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public float getLayoutAlignmentX(Container target) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public float getLayoutAlignmentY(Container target) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public void invalidateLayout(Container target) {
		// TODO 自动生成的方法存根
		
	}

}
