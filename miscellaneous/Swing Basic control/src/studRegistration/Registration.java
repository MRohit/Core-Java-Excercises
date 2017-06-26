package studRegistration;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	JTextField tf1;
	JLabel l1,l2,l3,l4;
	JList<String>list1,list2;
	JComboBox<String>cb;
	ButtonGroup bg;
	Vector<String>v1,v2;
	Registration rf;
	public Registration()
	{
		rf=this;
		b1=new JButton("Register");
		b2=new JButton("Cancel");
		b3=new JButton("Reset");
		b4=new JButton(">>");
		b5=new JButton("<<");
		tf1=new JTextField(10);
		l1=new JLabel("Name ");
		l2=new JLabel("Qualification");
		l3=new JLabel("Subject Offered");
		l4=new JLabel("Subject selected");
		list1=new JList<String>();
		list2=new JList<String>();
		cb=new JComboBox<String>();
		cb.addItem("B.E(comp)");
		cb.addItem("BCA");
		cb.addItem("BCS");
		cb.addItem("MCS");
		cb.addItem("MCA");
		v1=new Vector<String>();
		v1.add("C");
		v1.add("C++");
		v1.add("Core Java");
		v1.add("C#");
		v1.add("ASP.Net");
		v2= new Vector();
		list1.setListData(v1);
		list2.setListData(v2);
		
		Container con=getContentPane();
		setLayout(null);
		setVisible(true);
		
		l1.setBounds(20, 50, 100, 20);
		tf1.setBounds(170, 50, 100, 20);
		l2.setBounds(20, 80, 100, 20);
		cb.setBounds(170, 80, 100, 20);
		
		l3.setBounds(20, 120, 100, 20);
		l4.setBounds(200,120, 100, 20);
		
		list1.setBounds(20, 150, 100, 130);
		list2.setBounds(200, 150, 100, 130);
		
		b4.setBounds(130, 170, 60, 20);
		b5.setBounds(130, 200, 60, 20);
		b1.setBounds(30, 310, 100, 20);
		b2.setBounds(140, 310, 100, 20);
		b3.setBounds(250, 310, 100, 20);
		con.add(l1);
		con.add(tf1);
		con.add(l2);
		con.add(cb);
		con.add(l3);
		con.add(l4);
		con.add(list1);
		con.add(list2);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
	//	tf1.addKeyListener(this);
		tf1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				JOptionPane jp= new JOptionPane();
				jp.showMessageDialog(rf,  "Name should be in Capital","Erro Message ", JOptionPane.INFORMATION_MESSAGE);
			String s= tf1.getText();
			s=s.toUpperCase();
			tf1.setText(s);
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args)
	{
		Registration f= new Registration();
		f.setTitle("ABC Institute");
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b4)
		{
			int index= list1.getSelectedIndex();
			String s= v1.get(index);
			v2.add(s);
			list2.setListData(v2);
		}
		if(e.getSource()==b5)
		{
			int index= list2.getSelectedIndex();
			v2.remove(index);
			list2.setListData(v2);
		}
		
		
	}
}
