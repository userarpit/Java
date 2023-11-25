package Network;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class Datagrampacketclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytebuffer = new byte[15];
		String s = "datagram packet";
		bytebuffer = s.getBytes();
		InetAddress address = null;
		try {
			address = InetAddress.getByName("localhost");	
		
			DatagramPacket packet = new DatagramPacket(bytebuffer,bytebuffer.length,address, 9000);
			DatagramSocket ds = new DatagramSocket();
			ds.send(packet);
			ds.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}