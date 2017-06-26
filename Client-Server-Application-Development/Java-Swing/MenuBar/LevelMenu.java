package MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class LevelMenu extends JFrame{
	LevelMenu(){
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		
		JMenu color,red,green;
		color=new JMenu("color");
		red=new JMenu("red");
		green=new JMenu("green");
		
		JMenuItem light,dark;
		light=new JMenuItem("light");
		dark=new JMenuItem("dark");
		
		mb.add(color);
		mb.add(red);
		//mb.add(green);
		
	
		
		//color.add(red);
		color.add(green);
		
		red.add(light);
		JSeparator js=new JSeparator();
		red.add(dark);
		
		green.add(light);
		JSeparator js1=new JSeparator();
		green.add(dark);
		
		setVisible(true);
		setSize(300, 500);
	}
	public static void main(String[] args) {
		new LevelMenu();
	}
}
