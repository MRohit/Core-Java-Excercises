package Lab_13;


import java.awt.*;
import java.awt.event.*;

class Balls extends Frame implements Runnable, ActionListener
{
	Button b1, b2;
	Thread t1, t2, t3;
	int t1x, t2x, t3x;
	int t1y, t2y, t3y;

	boolean flag = true;

	public Balls()
	{
		 super("Running balls");
		 b1 = new Button("Stop");
		 b2 = new Button("Restart");

		 setLayout(new FlowLayout());
		 add(b1);
		 add(b2);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 setPars();
		 addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent w){ System.exit(0);}} );
	}

	public void setPars()
	{
	 	t1y=60;
		t2y=90;
		t3y=120;
		t1x=t2x=t3x = 5;
	}

	public void startThreads()
	{
		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		flag = true;
		
		t1.start();
		t2.start();
		t3.start();
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(t1x,t1y,20,20);
		g.setColor(Color.green);
		g.fillOval(t2x,t2y,20,20);
		g.setColor(Color.blue);
		g.fillOval(t3x,t3y,20,20);
	}

	public void run()
	{
		while(flag)
		{
			synchronized (this)
			{
				try
				{
				if (Thread.currentThread() == t1)
				{
					t1x += 10;
					Thread.sleep(50);
					if ( t1x >= 300)
					{
						wait();
					}
					repaint();
				}
				}
				 catch (Exception e)
				 {
				 }
	
				 try
				{
					if (Thread.currentThread() == t2)
					{
						t2x += 7;
						Thread.sleep(50);
						if ( t2x >= 300)
						{
							wait();
						}
						repaint();
					}
				 }
				 catch (Exception e)
				 {
				 }
	
				 try
				 {	 				 				 
					if (Thread.currentThread() == t3)
					{
						t3x += 4;
						Thread.sleep(50);
						if ( t3x >= 300)
						{
							notifyAll();
							setPars();
						}
						repaint();
					}
				 }
				 catch (Exception e)
				 {
				 }
			}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if ( e.getSource() == b1)
		{
			flag = false;
		}
		else
		{
			startThreads();
			//setPars();
		}
	}

	public static void main(String args[])
	{
		Balls f = new Balls();
		f.setSize(400,400);
		f.setVisible(true);
		f.startThreads();
		System.out.println(" i m ended ");
	}
}

