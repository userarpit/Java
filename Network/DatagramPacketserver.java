package Network;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramPacketserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds;
		byte[] data  = new byte[15];
		try {
			ds = new DatagramSocket(9000);
			DatagramPacket packet = new DatagramPacket(data,data.length);
		    
			ds.receive(packet);
			data=packet.getData();
		//	System.out.println(data);
		//	System.out.println(packet);
			for(byte b:data) {
				System.out.print((char)b);
			}
			ds.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}