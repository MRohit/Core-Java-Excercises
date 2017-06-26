import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class DemoTable extends JFrame{

	/**
	 * @param args
	 */
	public DemoTable() {
		// TODO Auto-generated constructor stub
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		String [] col={"Name","Subject","Batch","Marks1","Marks2","Marks3"
		};
		
		Object [][] data={
				{"ABC","C#","Batch-1","50","50","50"},
				{"DEF","C#","Batch-2","50","50","50"},
				{"GHI","C#","Batch-3","50","50","50"},
				{"JKL","C#","Batch-4","50","50","50"},
				{"MNO","C#","Batch-5","50","50","50"}
		};
		JTable tb=new JTable(data,col);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane jp=new JScrollPane(tb,v,h);
		cp.add(jp,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTable d=new DemoTable();
		d.setVisible(true);
		d.setSize(300, 300);
	}

}
