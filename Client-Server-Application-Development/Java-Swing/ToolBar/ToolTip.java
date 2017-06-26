package ToolBar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolTip {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b=new JButton("Button");
		frame.add(b,"Center");
		
		b.setToolTipText("A button Components");
		frame.setSize(300, 500);
		frame.setVisible(true);
	}
}
