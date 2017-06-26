import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class JDeskTopPaneDemo extends JFrame {

	JDesktopPane jdp;
	
	public JDeskTopPaneDemo(){
		super("MDI Application");
		setVisible(true);
		setSize(500,500);
		
		jdp =new JDesktopPane();
		
		createFrame("First Frame");
		createFrame("Seconde Frame");
		
		setContentPane(jdp);
		jdp.putClientProperty("JDesktopPane.dragMode","outline");
		
	}
	public void createFrame(String title){
		MyInternalFrame frm = new MyInternalFrame(title);
		
		frm.setVisible(true);
		
		jdp.add(frm);
		
		try {
			frm.setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	class MyInternalFrame extends JInternalFrame{
		public MyInternalFrame(String title) {
			super(title);
			setSize(300,300);
		}
	}
	
	
	
	public static void main(String[] args) {
		new JDeskTopPaneDemo();
	}

}
