package ToolBar;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;


public class TreeApp {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Creating a Tree Component");
		DefaultMutableTreeNode parent=new DefaultMutableTreeNode("Color",true);
		DefaultMutableTreeNode black=new DefaultMutableTreeNode("Black");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
		DefaultMutableTreeNode nBlue=new DefaultMutableTreeNode("Navy Blue");
		DefaultMutableTreeNode dBlue=new DefaultMutableTreeNode("Dark Blue");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("Green");
		DefaultMutableTreeNode white=new DefaultMutableTreeNode("White");
		
		parent.add(black);
		parent.add(blue);
		
		blue.add(nBlue);
		blue.add(dBlue);
		
		parent.add(green);
		parent.add(white);
		
		JTree tree=new JTree(parent);
		frame.add(tree);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}

