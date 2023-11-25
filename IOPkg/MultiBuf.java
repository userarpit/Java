package IOPkg;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;
public class MultiBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChannel inChannel = null;
		RandomAccessFile afile = null;
		try {
			afile = new RandomAccessFile("testout1.txt","rw");
			inChannel = afile.getChannel();
		System.out.println(inChannel.size());
		inChannel.truncate(10);
		System.out.println(inChannel.size());
		ByteBuffer name = ByteBuffer.allocate(5);
		ByteBuffer surname = ByteBuffer.allocate(11);
		ByteBuffer[] buf = { name,surname };
		long bytesRead = inChannel.read(buf); //read into buffer.
		System.out.println(name);
		System.out.println(bytesRead);
//		buf[0].flip();
//		System.out.println(buf[0]);
		while (bytesRead != -1) {
			System.out.println(name);
		  buf[0].flip();  //make buffer ready for read
		  System.out.println(name);
		  while(buf[0].hasRemaining()){
		      System.out.print((char) buf[0].get()); // read 1 byte at a time
		  }
		  System.out.println();
		  
		  buf[1].flip();
		  while(buf[1].hasRemaining()){
		      System.out.print((char) buf[1].get()); // read 1 byte at a time
		  }
		  buf[0].clear(); //make buffer ready for writing
		  buf[1].clear();
		  bytesRead = inChannel.read(buf);
		  System.out.println(name);
		  
		}
		afile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}