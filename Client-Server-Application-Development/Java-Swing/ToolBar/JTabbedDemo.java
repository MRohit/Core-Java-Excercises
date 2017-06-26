package ToolBar;


import javax.swing.*;

public class JTabbedDemo extends JFrame{
	private static final long sersialVersionUID=1l;
	public JTabbedDemo() {
		JButton b1=new JButton("First");
		JButton b2=new JButton("Second");
		JButton b3=new JButton("Third");
		JTabbedPane tb=new JTabbedPane();
		
		tb.add("First",b1);
		tb.add("Second",b2);
		tb.add("Third",b3);
		
		getContentPane().add(tb);
		setSize(100, 100);
		setVisible(true);

	}
	public static void main(String[] args) {
		new JTabbedDemo();
	}
}
