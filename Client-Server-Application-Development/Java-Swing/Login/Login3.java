package Login;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login3 {
	
	JFrame j=new JFrame("Login Application");
	final JButton b1;
	final JButton b2;
	final JButton b3;
	JLabel l1,l2;
	final JTextField t1 ;
	final JPasswordField t2;
	Login3() {
		
		t1=new JTextField(20);
	
		t2=new JPasswordField(20);
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		b3=new JButton("Clear");
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		Container con;
		j.add(l1);
		j.add(t1);
		j.add(l2);
		j.add(t2);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		
		j.setLayout(new FlowLayout());
		j.setVisible(true);
		j.setSize(300, 500);
		
		b1.addActionListener(new BusinessLogic());
		b2.addActionListener(new BusinessLogic());
		b3.addActionListener(new BusinessLogic());
	}
}
