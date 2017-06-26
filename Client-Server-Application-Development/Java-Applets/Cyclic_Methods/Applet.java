package Cyclic_Methods;

import java.awt.Graphics;

import javax.swing.JApplet;

public class Applet extends JApplet{
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("In initializing mode");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("The Applet has started");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("Currently Stopped");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Applet Being Destroyed");
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawString("Hello....This is my First Applet", 50, 50);
	}
}
