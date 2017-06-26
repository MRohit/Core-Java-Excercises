package ToolBar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class ProgressBar extends JFrame{
	public ProgressBar() {
		JFrame frame=new JFrame("ProgressBar");
		setVisible(true);
		setSize(300, 500);
		int min=0,max=100;
		JProgressBar pb=new JProgressBar(min,max);
		//pb.setVisible(true);
		frame.add(pb);
		for (int i = min; i <max; i++) {
			pb.setValue(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		pb.addChangeListener(new ChangeListener() {
		
		
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JProgressBar comp=(JProgressBar) e.getSource();
				int value=comp.getValue();
				int mini=comp.getMinimum();
				int maxim=comp.getMaximum();
				
			}
		});
	}
	
	public static void main(String[] args) {
		new ProgressBar();	
		
	}
}
