package Sockets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//InetAddress ia.getByName("lab2-10");
		InetAddress ia = InetAddress.getByName(args[0]);
		Socket s = new Socket(ia,1070);
		System.out.println("Request sent.....");
		
		String str;
		System.out.println("ENter the file name:");
		Scanner sc1=new Scanner(System.in);
		str=sc1.next();
		File f1=new File(str);
		FileInputStream fin=new FileInputStream(f1);
		char x;
		do{
			x=(char) fin.read();
			System.out.println(x);
		}while(x!=-1);
	}
}
 