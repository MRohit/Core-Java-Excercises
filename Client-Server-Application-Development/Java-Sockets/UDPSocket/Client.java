package UDPSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsoc=new DatagramSocket(24);
		byte buff[]=new byte[1024];
		DatagramPacket dpack=new DatagramPacket(buff,buff.length);
		System.out.println("Waiting for server's replay.......");
		dsoc.receive(dpack);
		System.out.println(new String(dpack.getData()));
	}
	
}
