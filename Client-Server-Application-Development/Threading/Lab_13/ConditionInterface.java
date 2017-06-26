package Lab_13;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import javax.swing.JFrame;

public class ConditionInterface extends JFrame implements Runnable{
	Thread t1,t2,t3;
	Condition c;
	int red1,green1,pink1;
	public ConditionInterface()
	{
		
		/*red1=150;
		red2=50;
		green1=100;
		green2=100;
		pink1=50;
		pink2=150;*/
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		
		
		t1.start();
		t2.start();
		t3.start();
		setSize(500, 500);
		setVisible(true);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		try{
			if(Thread.currentThread()==t1){
				synchronized(this){
				
					if(red1==100) 
					{
						c.await();					
					}
					red1++;
					//repaint();
					Thread.sleep(10);
				}
			}
			
		
	
			if(Thread.currentThread()==t2){
				synchronized(this){
					
						if(green1==200)
						{
							c.await();
						}
						green1++;
						Thread.sleep(20);
						//repaint();
				}
				
			}
			
		
		
		
			if(Thread.currentThread()==t3){
				synchronized(this){
				
					if(pink1==300)
					{
						c.signalAll();
					}
					pink1++;
					Thread.sleep(10);
					//repaint();
				}
			}
			repaint();
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}//
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(red1,100,20,20);
		g.setColor(Color.green);
		g.fillOval(green1,150,20,20);
		g.setColor(Color.pink);
		g.fillOval(pink1,250,20,20);
	}
	
	public static void main(String[] args) {
		new ConditionInterface();
	}
	
}
