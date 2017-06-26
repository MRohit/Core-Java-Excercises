package UDPSocket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsoc=new DatagramSocket();
		InetAddress host=InetAddress.getLocalHost();
		File f1=new File("file1.txt");
		File f2=new File("file1.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		FileInputStream fin=new FileInputStream(f2);
		int ch;
		Scanner sc=new Scanner(System.in);
		byte buf;
		do{
			ch=sc.nextInt();
			//buf=ch;
			fos.write(ch);
		}while(ch!=-1);
		
		do{
			buf=(byte)fin.read();
			
			dsoc.send(new DatagramPacket(null, buf,host,24));
		}while(ch!=-1);
		//String str=(new Date()).toStr
		//ing();
		//byte buf[]=str.getBytes();	
		//long len=f1.length();
		
		dsoc.close();
	}
	
}
