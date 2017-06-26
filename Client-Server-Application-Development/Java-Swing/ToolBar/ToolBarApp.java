package ToolBar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBarApp {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar tb=new JToolBar("Can Drag Out");
		tb.setFloatable(true);
		tb.setRollover(true);
		
		tb.add(new JButton("New"));
		tb.addSeparator();
		tb.add(new JButton("Open"));
		tb.addSeparator();
		tb.add(new JButton("Anything else"));
		
		frame.add(tb,"North");
		frame.setSize(300, 500);
		frame.setVisible(true);	
	}
}
