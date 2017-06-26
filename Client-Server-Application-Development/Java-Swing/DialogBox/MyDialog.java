package DialogBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyDialog extends JDialog implements ActionListener{
	JTextField t1,parenttf;
	JButton b1,b2;
	String str;
		
	public MyDialog(DialogFrame dialogFrame, boolean b,String st) {
		super(dialogFrame,b);
		str=st;
		setLayout(new FlowLayout());
		b1=new JButton("GetText");
		parenttf =new JTextField(20);
		//parenttf.setText(st);
		t1=new JTextField(20);
		b2=new JButton("Close");
		//t1.setText(st);
		add(t1);
		add(b1);
		add(b2);
		//System.out.println(st);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(300, 200);
		//setVisible(true);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			
			t1.setText(str);
			
			//dispose();
		}
		if(e.getSource()==b2){
			dispose();
			t1.setText(" ");

		}
	}
	
}
