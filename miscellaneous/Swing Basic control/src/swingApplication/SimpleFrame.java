package swingApplication;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SimpleFrame 
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame();
		f.setTitle("Simple Frame");
		f.setSize(400, 490);
		f.setVisible(true);
		JButton b1;
		JTextField tf1;
		JLabel l1;
		b1=new JButton("Submit");
		tf1=new JTextField(10);
		l1=new JLabel("Enter your Name");
		Container con=f.getContentPane();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	    b1.setBounds(50, 70, 100, 20);
		con.add(l1);
		con.add(tf1);
		con.add(b1);
	}

}
