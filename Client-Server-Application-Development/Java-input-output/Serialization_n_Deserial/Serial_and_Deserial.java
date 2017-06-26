package Serialization_n_Deserial;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Serial_and_Deserial extends JFrame implements Serializable, ActionListener{
	JButton b1,b2,b3;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JTextArea a1;
	public Serial_and_Deserial() {
		// TODO Auto-generated constructor stub
		b1=new JButton("Serial");
		b2=new JButton("DeSerial");
		b3=new JButton("Cance;");
		a1=new JTextArea(30, 40);
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		
		l1=new JLabel("Roll Number");
		l2=new JLabel("Name");
		l3=new JLabel("Marks");
		
		
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(a1);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	
		
		setVisible(true);
		setSize(300, 300);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Serial")){
			try{
				FileOutputStream fos;
				ObjectOutputStream oos;
				Student s1=new Student(3546, "XYZ", 67);
				System.out.println("Serializing the object..");
				fos=new FileOutputStream("serial.txt");
				oos=new ObjectOutputStream(fos);
				oos.writeObject(s1);
				System.out.println(s1);
				oos.close();
				JOptionPane.showMessageDialog(b1, "Serialization has been done");
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
		
		if(e.getActionCommand().equals("DeSerial")){
			//Student s2=new Student(3545, "MNO", 79);
			
			
			FileInputStream fis;
			ObjectInputStream ois;
			int r;
			Object n;
			double m;
			String s;
			
			System.out.println("Deserializing the object");
			try{
				Student s3;
				fis=new FileInputStream("serial.txt");
				ois=new ObjectInputStream(fis);
				s3=(Student)ois.readObject();
				//s3=(Student)ois.read();
				System.out.println(s3);
			//	m=s3.marks;
			//	r=s3.roll;
			//	n=s3.name;
				/*n=(Object)s3;
				
				s=(String) n;*/
				a1.setText(""+s3);
				ois.close();
				
				//JOptionPane.showMessageDialog(b2, "Deserialization has been done");
			}
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		if(e.getActionCommand().equals("Cancel")){
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
	public static void main(String[] args) {
		new Serial_and_Deserial();
		
	}
}
