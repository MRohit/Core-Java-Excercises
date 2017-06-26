package File_Handling;

import java.io.File;
import java.io.IOException;

public class FileWrite {
	File f;
	char ch;
	FileWrite() throws IOException{
		f=new File("Myfile.txt");
		if(f.exists()){
			System.out.println("File Exist");
		}else {
			f.createNewFile();
			System.out.println("File does not exist");
		}
		try{
			while((ch=(char)System.in.read())!='\n'){
				
			}
		}
		catch(Exception e){
			System.out.println("Could not Write");
		}
	}
	public static void main(String[] args) {
		
		//FileWrite f=new FileWrite();
		char ch;
		System.out.println("Enter the string:");
		
		//String s=new String(sb);
	//	System.out.println(s);
	}
}
