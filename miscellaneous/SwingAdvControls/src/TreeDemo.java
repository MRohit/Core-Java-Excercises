import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;


public class TreeDemo extends JFrame {

	DefaultMutableTreeNode parent, black,blue,nblue,dblue,green,white;
	
	
	public TreeDemo(){
		super("Tree Demo");
		
		parent = new DefaultMutableTreeNode("Color",true);
		black = new DefaultMutableTreeNode("Black");
		blue = new DefaultMutableTreeNode("Blue");
		nblue = new DefaultMutableTreeNode("Navy Blue");
		dblue = new DefaultMutableTreeNode("Dark Blue");
		green = new DefaultMutableTreeNode("Green");
		white = new DefaultMutableTreeNode("White");
		
		parent.add(black);
		parent.add(blue);
		blue.add(nblue);
		blue.add(dblue);
		parent.add(green);
		parent.add(white);
		
		
		JTree tree = new JTree(parent);
		Container c = getContentPane();
		c.add(tree);
		
		
		
		setSize(500,500);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new TreeDemo();

	}

}
