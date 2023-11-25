package IOPkg;
import java.io.*;
public class RandomAccessFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(RandomAccessFile raf = new RandomAccessFile("testout1.txt","rw")) {
			//RandomAccessFile raf = new RandomAccessFile("testout1.txt","rw");
			raf.seek(10);	
			System.out.println((char)raf.read());
			System.out.println(raf.getFilePointer());
			
			byte[] b = new byte[1024];
			int offset = 4;
			int length = 20;
			int bytesread = raf.read(b, offset, length);
			System.out.println(bytesread);
			for(byte b1:b) {
				System.out.print((char)b1);
			}
			//System.out.println((char)b[0]);
			System.out.println(raf.getFilePointer());
			raf.write(65);
			System.out.println(raf.getFilePointer());
			raf.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
