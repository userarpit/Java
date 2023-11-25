package IOPkg;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class WriteChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("testout1.txt","rw");
			FileChannel fc = raf.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(16);
			bb.clear();
			String name = "Arpit Khandelwal";
			
			bb.put(name.getBytes());
			bb.flip();
			/*while(bb.hasRemaining()) {
				fc.write(bb);
			}*/
			fc.write(bb);
			
			fc.force(true);
			fc.close();
			raf.close();
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
