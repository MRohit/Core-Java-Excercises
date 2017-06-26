package Lab1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Stu_Reg_form extends JFrame implements ActionListener{
	JFrame j=new JFrame("Student Registration form");
	JLabel l1,l2,l3,l4;
	final JTextField t1 ,t2;
	final JButton b1,b2,b3,b4,b5;
	//JList<List> list1;
	//final JComboBox<String> c1,c2;
	//final JList<String>list2;
	String []data= {"One","two","Three","four"};	 	
	JList<String> list1 = new JList<String>(data);
	JList<String> list2 = new JList<String>(data);
	public Stu_Reg_form() {
		

		l1=new JLabel("Name");
		l2=new JLabel("Qualification");
		l3=new JLabel("Subjects Offered");
		l4=new JLabel("Subjects Selected");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("Register");
		b2=new JButton("Cancel");
		b3=new JButton("Reset");
		b4=new JButton(">>");
		b5=new JButton("<<");
		//list1=new JList<String>(data);
		list2=new JList<>();
		
		
		
		//Add the items on the frame
		j.add(l1);
		j.add(t1);
		j.add(l2);
		j.add(t2);
		j.add(l3);
		j.add(list1);
		j.add(b4);
		j.add(b5);
		j.add(l4);
		j.add(list2);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		
		
		
		j.setLayout(new FlowLayout());
		j.setVisible(true);
		j.setSize(300, 500);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		
	}
	
	public static void main(String[] args) {
		new Stu_Reg_form();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			if(t1.getText().equals("")){
				JOptionPane.showMessageDialog(b1, "Please enter your name");
			}else
				JOptionPane.showMessageDialog(b1, "Registration successful");
		}
		if(e.getSource()==b2){
			System.exit(0);

		}
		if(e.getSource()==b3){
			t1.setText("");
			t2.setText("");
		
		}
		if(e.getSource()==b4){
			
		}
	}
}
