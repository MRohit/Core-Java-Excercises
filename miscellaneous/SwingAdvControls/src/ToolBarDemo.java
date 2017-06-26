import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;


public class ToolBarDemo extends JFrame {

	JToolBar toolbar;
	
	public ToolBarDemo(){
		super("ToolBar Demo");
		
		toolbar = new JToolBar("Standard Tool Bar");
		toolbar.add(new JButton("Save"));
		toolbar.add(new JButton("Cut"));
		toolbar.add(new JButton("Paste"));
		
		toolbar.setFloatable(true	);
		
		Container c = getContentPane();
		c.add(toolbar,BorderLayout.NORTH);

		setSize(400,400);
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new ToolBarDemo();
	}

}
