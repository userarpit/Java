package IOPkg;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class MultiChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChannel fromChannel = null;
		FileChannel toChannel = null;
		RandomAccessFile fromfile = null;
		RandomAccessFile tofile = null;
		try {
			fromfile = new RandomAccessFile("testout1.txt","r");
			tofile = new RandomAccessFile("testout2.txt","rw");
			
			fromChannel = fromfile.getChannel();
			toChannel = tofile.getChannel();
			long position = 0;
			long count = fromChannel.size();
			fromChannel.transferTo(position, count, toChannel);
			fromChannel.close();
			toChannel.close();
			fromfile.close();
			tofile.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
