import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;


public class TabbedPaneDemo extends JFrame {

	
	JButton b1,b2,b3;
	
	JTabbedPane tabbedPane;

	
	public TabbedPaneDemo(){
		super("TabbedPane Demo");
		
		b1 = new JButton("Save");
		b2 = new JButton("Cut");
		b3 = new JButton("Paste");
		
		tabbedPane = new JTabbedPane();
		 
		
		tabbedPane.add("first" ,b1);
		tabbedPane.add("second" ,b2);
		tabbedPane.add("Third" ,b3);
		
		
		Container c = getContentPane();
		c.add(tabbedPane);

		setSize(400,400);
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new TabbedPaneDemo();
	}

}
