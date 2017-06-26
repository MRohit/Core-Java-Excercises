package ToolBar;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;


public class LayeredApp extends JFrame{

	/**
	 * @param args
	 */
	public LayeredApp() {
		super("Layered Pane Demonstration");
		setSize(200,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLayeredPane lp=getLayeredPane();
		JButton top=new JButton();
		top.setBackground(Color.white);
		top.setBounds(20, 20, 50, 50);
	
		JButton middle=new JButton();
		middle.setBackground(Color.gray);
		middle.setBounds(20, 20, 50, 50);
		
		JButton bottom=new JButton();
		bottom.setBackground(Color.black);
		bottom.setBounds(20, 20, 50, 50);
		
		lp.add(middle,new Integer(2));
		lp.add(bottom,new Integer(1));
		lp.add(top,new Integer(3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayeredApp sq=new LayeredApp();
		sq.setSize(400,400);
		sq.setVisible(true);
	}

}

