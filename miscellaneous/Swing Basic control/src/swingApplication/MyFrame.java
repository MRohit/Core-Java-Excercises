package swingApplication;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	JButton b1;
	JTextField tf1;
	JLabel l1;
	JList<String>list;
	Vector<String>v1;
	JComboBox<String>cb;
	JCheckBox cb1,cb2;
	JRadioButton r1,r2;
	ButtonGroup bg;
	public MyFrame()
	{
		b1=new JButton("Submit");
		tf1=new JTextField(10);
		l1=new JLabel("Enter Name ");
		list=new JList<String>();
		cb=new JComboBox<String>();
		cb.addItem("Pune");
		cb.addItem("Mumbai");
		cb.addItem("Delhi");
		cb.addItem("Kolkata");
		cb.addItem("Goa");
		v1=new Vector<String>();
		v1.add("Physics");
		v1.add("Chemistry");
		v1.add("Maths");
		v1.add("Biology");
		list.setListData(v1);
		cb1=new JCheckBox("Maths");
		cb2=new JCheckBox("Physics");
		r1=new JRadioButton("Yes");
		r2=new JRadioButton("No");
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		Container con=getContentPane();
		setLayout(new FlowLayout());
		l1.setBounds(50, 120, 150, 50);
		list.setBounds(100, 130, 170, 20);
		tf1.setBounds(50, 130, 100, 150);
		b1.setBounds(50, 70, 100, 20);
		con.add(l1);
		con.add(tf1);
		con.add(b1);
		con.add(list);
		con.add(cb1);
		con.add(cb2);
		con.add(r1);
		con.add(r2);
		setSize(400, 500);
		setVisible(true);
		}


	public static void main(String[] args)
	{
		MyFrame f= new MyFrame();
	}

}
