package DialogBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DialogFrame extends JFrame implements ActionListener{
	 JTextField t1;
	 JButton b1;
	 MyDialog d1;
	 String str;
	 public DialogFrame() {
		 t1=new JTextField(20);
		 b1=new JButton("Show");
		 setLayout(new FlowLayout());
		 add(t1);
		 add(b1);
		 
		 
		
		 setSize(300,500);
		 setVisible(true);
		 b1.addActionListener(this);
	}
	 public DialogFrame(MyDialog d1) {
		 this.d1=d1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			str=t1.getText();
			// System.out.println(str);
			
			d1=new MyDialog(this,true,str);
			d1.setVisible(true);
		}
	}
	public static void main(String[] args) {
		DialogFrame f1=new DialogFrame();
	}
	 
}
