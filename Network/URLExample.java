package Network;

import java.net.*;
import java.io.*;

public class URLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://google.com");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			System.out.println(url.getAuthority());
			System.out.println(url.getQuery());
			System.out.println(url.getContent());
			System.out.println(url.toExternalForm());
			System.out.println(url.toURI());
			System.out.println(url.getDefaultPort());
			System.out.println("HttpURLConnection data below");
			
		//	URL url = new URL("file:testout1.txt");
			HttpURLConnection urlconn = (HttpURLConnection)url.openConnection();
			System.out.println(urlconn.getRequestMethod());
		/*	urlconn.setDoOutput(true);
			System.out.println(urlconn.getContentType());
			System.out.println(urlconn.getContentEncoding());
			System.out.println(urlconn.getContentLength());*/
		
			for(int i=1;i<=8;i++){  
				System.out.println(urlconn.getHeaderFieldKey(i)+" = "+urlconn.getHeaderField(i));  
				}  
			
			
			
			urlconn.disconnect();
		//	URLConnection urlconn = new URLConnection(url);
			/*InputStream input = urlconn.getInputStream();
			

			int data = input.read();
			while(data != -1){
			    System.out.print((char) data);
			    data = input.read();
			}
			input.close();*/
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

}
