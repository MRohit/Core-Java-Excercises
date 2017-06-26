import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JToolTip;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ToolTipDemo extends JFrame {
	
	JButton btn;
	
	public ToolTipDemo(){
		super("Tool tip demo");
		
		//jprobar = new JProgressBar();
		
		btn = new JButton("Exit");
		btn.setToolTipText("Click to Exit");
		
			btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(btn);
		
		
		setSize(400,400);
		setVisible(true);		
	}

	
	public static void main(String[] args) {
		new ToolTipDemo();
		

	}

}
