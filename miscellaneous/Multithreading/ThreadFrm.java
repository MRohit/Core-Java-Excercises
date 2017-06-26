import java.awt.*;
import java.awt.event.*;
class ThreadFrm extends Frame implements Runnable,ActionListener
{
	Button btnStart,btnStop;
	int x;
	Thread t;
	static int count=0;

	ThreadFrm()
	{
		btnStart=new Button("Start");
		btnStart.addActionListener(this);

		btnStop=new Button("Stop");
		btnStop.addActionListener(this);

		setLayout(new FlowLayout());

		add(btnStart);
		add(btnStop);

		t=new Thread(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		);
		
	}

	public void run()
	{
		for(;;)
		{
			
			x=x+5;
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(x>500)
			{
				x=10;
			}
			repaint();
		}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==btnStart)
		{
			count++;
			if(count==1)
			{
				t.start();
			}
			else
			{
				t.resume();
			}

		}
		if(e.getSource()==btnStop)
		{
			if(t.isAlive())
			{
				t.suspend();
			}
		}

		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(x,250,30,30);
	}

	public static void main(String[] args) 
	{
		ThreadFrm f=new ThreadFrm();
		f.setSize(600,500);
		f.setVisible(true);
		
	}
}
