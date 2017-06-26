package Console;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class ConsoleDemo {
	public static void main(String[] args) throws IOException {
		Console console=System.console();
		File f1=new File("console.txt");
		FileOutputStream fos=null;
		fos=new FileOutputStream(f1);
		if(console!=null){
			String name=console.readLine("Please provide your name");
			
			console.printf("Hello"+" "+"Mr."+name);
			
			byte[] b;
			b=name.getBytes();
			fos.write(b);
		}
		
	}
}
