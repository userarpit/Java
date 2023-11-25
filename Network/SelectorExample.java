package Network;

import java.nio.channels.*;
import java.nio.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class SelectorExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Selector selector = Selector.open();
	/*	System.out.println(selector.isOpen());
		System.out.println(selector.provider());*/
		System.out.println("Selector is open for making connection: " + selector.isOpen());  
		ServerSocketChannel ssc = ServerSocketChannel.open(); 
		InetSocketAddress host = new InetSocketAddress("localhost",8080);
		ssc.bind(host);
		ssc.configureBlocking(false);  
		int ops = ssc.validOps();
		System.out.println(ops);
		SelectionKey selectky = ssc.register(selector, ops);
		System.out.println(selectky);
		
		for (;;) {  
            System.out.println("Waiting for the select operation...");  
            int noOfKeys = selector.select();  
            System.out.println("The Number of selected keys are: " + noOfKeys);  
            Set<SelectionKey> selectedKeys = selector.selectedKeys();  
            Iterator<SelectionKey> itr = selectedKeys.iterator();  
            while (itr.hasNext()) {  
                SelectionKey ky = (SelectionKey) itr.next();  
                System.out.println("****" + ky);
                if (ky.isAcceptable()) {  
                    // The new client connection is accepted  
                    SocketChannel client = ssc.accept();
                    client.configureBlocking(false);  
                    // The new connection is added to a selector  
                    client.register(selector, SelectionKey.OP_READ);  
                    System.out.println("The new connection is accepted from the client: " + client);  
                }  
                else if (ky.isReadable()) {  
                    // Data is read from the client  
                    SocketChannel client = (SocketChannel) ky.channel();  
                    ByteBuffer buffer = ByteBuffer.allocate(256);  
                    client.read(buffer);  
                    String output = new String(buffer.array()).trim();  
                    System.out.println("Message read from client: " + output);  
                    if (output.equals("Bye Bye")) {  
                        client.close();  
                        System.out.println("The Client messages are complete; close the session.");  
                    }  
                }  
                itr.remove();  
            } // end of while loop  
        } // end of for loop  
	}

}
