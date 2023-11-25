package Network;

import java.net.InetAddress;

public class Addresss {
	public static void main(String[] args) {
		try {
			InetAddress[] address = InetAddress.getAllByName("google.com");
			for(InetAddress ia : address) {
				System.out.println(ia.isAnyLocalAddress());
				System.out.println(ia.isMulticastAddress());
				System.out.println(ia.isLoopbackAddress());
				System.out.println(ia); 
				System.out.println("*****************\r\n");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
}
