package Login;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login2 implements ActionListener{
	JFrame j=new JFrame("Login Application");
	final JButton b1;
	final JButton b2;
	final JButton b3;
	JLabel l1,l2;
	final JTextField t1 ;
	final JPasswordField t2;
	Login2() {
		
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
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			if(t1.getText().equals("abc") && t2.getText().equals("abc")){
				JOptionPane.showMessageDialog(b1, "Welcome");
			}else
				JOptionPane.showMessageDialog(b1, "Invalid Username/Password");
		}
		if(e.getSource()==b2){
			System.exit(0);

		}
		if(e.getSource()==b3){
			t1.setText("");
			t2.setText("");
		
		}
	}

	public static void main(String[] args) {
		new Login2();
	}
	
	
}
