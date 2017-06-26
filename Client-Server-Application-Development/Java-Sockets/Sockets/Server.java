package Sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket ss = new ServerSocket(1070);
		System.out.println("Server is Ready");

		Socket s = ss.accept();

		System.out.println("Client  is Connected");
		   File f1=new File("file1.txt");
			FileOutputStream fin=null;
			fin=new FileOutputStream(f1);
			
		//PrintWriter ps = new PrintWriter(s.getOutputStream(),true);
		//DataInputStream dis = new DataInputStream(s.getInputStream());

	    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char ch;
	    while((ch=(char)System.in.read())!='\n')
		{
			//String str = dis.readLine();
			fin.write((char)ch);
			//System.out.println(str);
			//ps.println(br.readLine());
		}
		
		
		//Scanner sc1=new Scanner(System.in);
		//System.out.println("Enter the data");
		//int x;
		//byte[] b;
		/*do{
			x=sc1.nextInt();
			//
			fin.write(x);
			//fos.write(x);
		}while(x!=-1);*/
		
		
	}
}
