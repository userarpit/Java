package Network;
import java.net.*;
public class InetAddressExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetSocketAddress host = new InetSocketAddress("localhost",8080);
		System.out.println(host.getAddress());
		System.out.println(host.getHostName());
		System.out.println(host.getHostString());
		System.out.println(host.getPort());
		System.out.println(host.getClass());
		System.out.println(host.toString());
		
	}

}
