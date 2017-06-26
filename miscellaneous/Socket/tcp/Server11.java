package com.tcp;

import java.net.*;
import java.io.*;

class Server11
{
	public static void main(String[] args) 
	{
		try
		{
		ServerSocket ss = new ServerSocket(1070);
		System.out.println("Server is Ready");

		Socket s = ss.accept();

		System.out.println("Client  is Connected");

		PrintWriter ps = new PrintWriter(s.getOutputStream(),true);
		DataInputStream dis = new DataInputStream(s.getInputStream());

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		while(true)
		{
			String str = dis.readLine();
			System.out.println(str);
			ps.println(br.readLine());
		}
	}

	catch(Exception e)
		{
			e.printStackTrace();
	    }

	}
}