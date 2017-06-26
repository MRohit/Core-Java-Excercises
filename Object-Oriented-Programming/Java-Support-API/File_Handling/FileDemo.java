package File_Handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	File f;
	String first_name,path,abspath;
	public FileDemo() throws IOException {
		f=new File("Myfile.txt");
		if(f.exists()){
			System.out.println("File Exist");
		}else {
			f.createNewFile();
			System.out.println("File does not exist");
		}
		System.out.println("File Name is:"+f.getName());
		System.out.println("Path is:"+f.getPath());
		System.out.println("Absolute path is:"+f.getAbsolutePath());
		if(f.canRead()==true)
			System.out.println("You can Read a file");
		if(f.canWrite()==true)
			System.out.println("You can Write in file");
		if(f.isAbsolute()==true)
			System.out.println("File has absolute path");
		long size=f.length();
		System.out.println("Size of file is"+size);
	}
	public static void main(String[] args) throws IOException {
		FileDemo f=new FileDemo();
	} 
}
