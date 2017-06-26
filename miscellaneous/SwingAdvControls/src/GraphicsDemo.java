import javax.swing.*;
import java.awt.*;

class GraphicsDemo extends JFrame
{
	MyPanel p;
	public GraphicsDemo(){
		super("Graphics Demo");
		p = new MyPanel();

		Container c = getContentPane();
		c.add(p);


		setSize(500,500);
		setVisible(true);
	}

	
	class MyPanel extends JPanel
	{
		public void paint(Graphics g){
			g.setColor(Color.red);
			g.drawString("Welcome",100,100);
			
			g.setColor(Color.blue);
			g.drawLine(100,120,170,120);

			g.setColor(Color.green);
			g.drawRect(80,80,80,30 );


		}

	}


	public static void main(String[] args) 
	{
			new GraphicsDemo();
	}

}
