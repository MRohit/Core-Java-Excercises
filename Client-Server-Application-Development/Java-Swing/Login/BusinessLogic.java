package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BusinessLogic implements ActionListener{

	Login3 l;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==l.b1){
			if(l.t1.getText().equals("abc") && l.t2.getText().equals("abc")){
				JOptionPane.showMessageDialog(l.b1, "Welcome");
			}else
				JOptionPane.showMessageDialog(l.b1, "Invalid Username/Password");
		}
		if(e.getSource()==l.b2){
			System.exit(0);

		}
		if(e.getSource()==l.b3){
			l.t1.setText("");
			l.t2.setText("");
		
		}
		
	}

}
