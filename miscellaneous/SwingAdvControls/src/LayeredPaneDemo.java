import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;


public class LayeredPaneDemo extends JFrame {

	JLayeredPane lp;
	JButton top,middle,bottom;
	
	
	public LayeredPaneDemo(){
		super("Layered Pane Demo");
		
		lp = getLayeredPane();
		
		top = new JButton();
		top.setBounds(20,20,50,50);
		top.setBackground(Color.white);
		
		middle = new JButton();
		middle.setBounds(40,40,50,50);
		middle.setBackground(Color.gray);
		
		bottom = new JButton();
		bottom.setBounds(60,60,50,50);
		bottom.setBackground(Color.black);
		
		lp.add(top ,1);
		lp.add(middle,2);
		lp.add(bottom,3);
		
		
		setSize(500,500);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new LayeredPaneDemo();

	}

}
