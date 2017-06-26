package File_and_Directory_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int x;
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		RandomAccessFile r1=new RandomAccessFile(f1, "r");
		RandomAccessFile r2=new RandomAccessFile(f2, "rw");
		try{
		
		System.out.println("Before setting the pointer"+""+r1.getFilePointer());
	
			r1.seek(3);
		
			
		
		System.out.println("After setting pointer"+""+r1.getFilePointer());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		do{
			x=r1.read();
			r2.write((char)x);
		}while(x!=-1);
		System.out.println("Written");
	}

}
