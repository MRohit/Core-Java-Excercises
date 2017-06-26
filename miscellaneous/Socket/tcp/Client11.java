package com.tcp;

import java.net.*;
import java.io.*;

class Client11
{
	public static void main(String[] args) 
	{
		try
		{
		InetAddress ia = InetAddress.getByName(args[0]);
		Socket s = new Socket(ia,1070);
		DataInputStream di = new DataInputStream(s.getInputStream());
		PrintWriter p = new PrintWriter(s.getOutputStream(),true);
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		while (true)
		{
			String str = br.readLine();
			p.println(str);
			System.out.println(di.readLine());
		}
	}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}