package MenuBar;

import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpMenu extends JFrame{
	JPopupMenu m;
	int x ,y ;
	public PopUpMenu() {
	
		
		JMenuItem cut;
		JMenuItem copy,paste;
		
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		m=new JPopupMenu();
		m.add(cut);
		m.add(copy);
		m.add(paste);
		repaint();
		addMouseListener(new MouseAdapter() {
		
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.isPopupTrigger()){
				

					m.show(e.getComponent(),e.getX(),e.getY());
					x=e.getX();
					y=e.getY();
					repaint();

				}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.isPopupTrigger()){
					
					m.show(e.getComponent(),e.getX(),e.getY());
					x=e.getX();
					y=e.getY();
					repaint();


				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setVisible(true);
		setSize(300, 500);
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
	
		String str="X="+x+"Y="+y;
		g.drawString(str, x, y);
	}
	/*public void paint(Graphics g){
		
		
	}*/
	public static void main(String[] args) {
		new PopUpMenu();
	}
}
