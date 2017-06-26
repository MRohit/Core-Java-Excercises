package com.seed;

import java.net.*;
class  InetAddrDemo
{
	public static void main(String[] args) throws Exception
	{
	
		if (args.length != 1)
			{
			System.out.println("INVALID Number of Parameter");
			System.exit(0);
			}
		else
		{
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("Host Name :-" + ia.getHostName());
			System.out.println("IP Address :-" + ia.getHostAddress());
		}
		
	}
}
