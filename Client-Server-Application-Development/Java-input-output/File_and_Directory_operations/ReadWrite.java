package File_and_Directory_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		FileOutputStream fos=null;
		int x;
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		try{
			fin=new FileInputStream(f1);
			fos=new FileOutputStream(f2);
			do{
				x=fin.read();
				fos.write(x);
			}while(x!=-1);
			fin.close();
			fos.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
