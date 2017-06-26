import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class AppletTag extends JApplet{
	String str;
	String st="Hello";
	int size;
	Font f;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		str=getParameter("FontName");
		String x=getParameter("Size");
		size=Integer.parseInt(x);
		f=new Font(str, Font.ITALIC, size);
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setFont(f);		
		g.drawString(st, 200, 200);
	}
}