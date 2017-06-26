import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JProgressBarDemo extends JFrame {
	
	JProgressBar jprobar;
	JLabel lbl;
	JButton btn;
	
	public JProgressBarDemo(){
		super("Progress Bar demo");
		
		//jprobar = new JProgressBar();
		lbl = new JLabel();
		btn = new JButton("Click");
		
jprobar = 
new JProgressBar(JProgressBar.HORIZONTAL,0,100);
		
		
jprobar.addChangeListener( new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				lbl.setText(jprobar.getString());
				
				
			}
		});
		
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jprobar.setValue( jprobar.getValue() + 10);
				
			}
		});
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jprobar);
		c.add(btn);
		c.add(lbl);
		
		
		setSize(400,400);
		setVisible(true);		
	}

	
	public static void main(String[] args) {
		new JProgressBarDemo();
		

	}

}
