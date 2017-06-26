package com.udp;
// run client first
import java.net.*;
import java.io.*;

class UDPClient
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket dsoc=new DatagramSocket(24);
		byte buff[]=new byte[1024];
		DatagramPacket dpack=new DatagramPacket(buff,buff.length);
		System.out.println("Waiting for server's replay.......");
		dsoc.receive(dpack);
		System.out.println(new String(dpack.getData()));
	}
}
