package IOPkg;

import java.io.*;

public class BufferInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fos = null;
		BufferedInputStream bos = null;
	
		try {
			fos = new FileInputStream("testout.txt");
			bos = new BufferedInputStream(fos);	
			bos.skip(8);
			//byte[] b = new byte[bos.available()];
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.println();
			bos.mark(5	);
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.println();
			bos.reset();
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			System.out.print((char)bos.read());
			
		/*	for(byte b1: b) {
				System.out.print((char)b1);	
			}*/
			//System.out.println(bos.markSupported());
			
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
