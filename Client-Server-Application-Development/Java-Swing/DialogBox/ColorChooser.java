package DialogBox;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser {
	public ColorChooser() {
		JFrame frame=new JFrame("Color Chooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=frame.getContentPane();
		
		JColorChooser jcc=new JColorChooser();
		
		@SuppressWarnings("static-access")
		Color co=jcc.showDialog(frame, "Color", Color.gray);
		con.setBackground(co);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300, 500);
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
