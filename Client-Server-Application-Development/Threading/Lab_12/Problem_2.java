package Lab_12;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Problem_2 extends JFrame implements Runnable{
	int x1=0,x2=400,y1=0,y2=0;
	String st1="ABC",st2="DEF";
	Thread t1,t2;
	
	public Problem_2() {
		
		t1=new Thread(this);
		t2=new Thread(this);
		t1.start();
		t2.start();
		
		setSize(500, 500);
		setVisible(true);
	}
	@Override
	public void run() {
		while(true){
		try{
		// TODO Auto-generated method stub
			
				if(Thread.currentThread()==t1){
					if(x1==400)	
						x1=0;
					else
						x1++;
					Thread.sleep(10);
				}
				if(Thread.currentThread()==t2){
					if(x2==0)	
						x2=400;
					else	
						x2--;
					Thread.sleep(10);
				}
				if(x1==x2){
					t1.stop();
					t2.stop();
				}
				repaint();
			}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawString(st1, x1, 50);
		g.drawString(st2, x2, 50);
	}
	public static void main(String[] args) {
		Problem_2 p=new Problem_2();
	}
}
