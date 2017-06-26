package DialogBox;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileChooser {
	public FileChooser() {
		JFrame frame=new JFrame("Color Chooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=frame.getContentPane();
		
		final JLabel dirlabel=new JLabel(" ");
		dirlabel.setFont(new Font("Serif",Font.BOLD,45));
		con.add(dirlabel,BorderLayout.NORTH);
		
		final JLabel filename=new JLabel(" ");
		filename.setFont(new Font("Serif",Font.BOLD,45));
		con.add(filename,BorderLayout.SOUTH);
		
		JFileChooser filechooser=new JFileChooser(" ");
		filechooser.setControlButtonsAreShown(false);
		con.add(filechooser,BorderLayout.CENTER);
		
		ActionListener actionlistener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser thefilechooser=(JFileChooser)e.getSource();
				String command=e.getActionCommand();
				if(command.equals(JFileChooser.APPROVE_SELECTION)){
					File selectedfile=thefilechooser.getSelectedFile();
					dirlabel.setText(selectedfile.getParent());
					filename.setText(thefilechooser.getName());
				}else if(command.equals(JFileChooser.CANCEL_SELECTION)){
					dirlabel.setText(" ");
					filename.setText(" ");
				}
			}
		};
		filechooser.addActionListener(actionlistener);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300, 500);
	}
	public static void main(String[] args) {
		new FileChooser();
	}
}
