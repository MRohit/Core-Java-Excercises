import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;


public class SplitPaneDemo extends JFrame {

	
	JButton b1,b2,b3;
	
	JSplitPane splitPane;

	
	public SplitPaneDemo(){
		super("splitPane Demo");
		
		b1 = new JButton("Save");
		b2 = new JButton("Cut");
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitPane.setTopComponent(b1);
		splitPane.setBottomComponent(b2);
		
		//splitPane.setDividerLocation(0.5);
		
		
		Container c = getContentPane();
		c.add(splitPane);

		setSize(400,400);
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new SplitPaneDemo();
	}

}
