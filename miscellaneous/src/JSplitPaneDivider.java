import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSplitPane;


public class JSplitPaneDivider {
	public static void main(String[] args) {
		JFrame horizontalFrame=new JFrame();
		horizontalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent topbutton=new JButton("Left");
		JComponent bottombutton=new JButton("Right");
		final JSplitPane splitpane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitpane.setTopComponent(topbutton);
		splitpane.setBottomComponent(bottombutton);
		
		horizontalFrame.add(splitpane,BorderLayout.CENTER);
		horizontalFrame.setSize(150, 150);
		horizontalFrame.setVisible(true);
		splitpane.setDividerLocation(0.5);
		
	}
}
