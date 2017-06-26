package Console;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the string:");
		s=sc.next();
		File f1=new File("console.txt");
		FileOutputStream fos=null;
		fos=new FileOutputStream(f1);
		byte[] b=s.getBytes();
		//fos.write(b);
		fos.write(b);
		System.out.println("String has been saved in File");
		fos.close();
		
	}
}
