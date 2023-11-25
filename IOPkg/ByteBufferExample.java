package IOPkg;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;
public class ByteBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChannel inChannel = null;
		RandomAccessFile afile = null;
		try {
			afile = new RandomAccessFile("testout1.txt","rw");
			inChannel = afile.getChannel();
		
		ByteBuffer buf = ByteBuffer.allocate(60);
		int bytesRead = inChannel.read(buf); //read into buffer.
		buf.put(32,(byte)66);
		while (bytesRead != -1) {

		  buf.flip();  //make buffer ready for read

		  while(buf.hasRemaining()){
		      System.out.print((char) buf.get()); // read 1 byte at a time
		  }
		  System.out.println();
		  System.out.println(buf.position());
		  buf.rewind();
		  System.out.println(buf.position());
		  System.out.println(buf.hasRemaining());
		  System.out.println(buf.limit());
		  
		  System.out.print((char) buf.get());
		  while(buf.hasRemaining()){
		      System.out.print((char) buf.get()); // read 1 byte at a time
		  }
		  buf.clear(); //make buffer ready for writing
	/*	  System.out.println(buf.hasRemaining());
		  System.out.println("********");
		  while(buf.hasRemaining()){
		      System.out.print((char) buf.get()); // read 1 byte at a time
		  }
		  System.out.println("********");*/
		  System.out.println();
		  bytesRead = inChannel.read(buf);
		  System.out.println(bytesRead);
		}
		afile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}