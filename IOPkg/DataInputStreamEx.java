package IOPkg;

import java.io.*;
public class DataInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("testout2.txt");
			DataInputStream dos = new DataInputStream(fis);
			
			int count = fis.available();
			byte[] b = new byte[count];
			dos.read(b);
			for(byte b1 : b) {
				System.out.print((char)b1);	
			}
			
			/*char c;
			while((c=dos.readChar()) != -1) {
				System.out.print(" " + c);	
			}*/
			dos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
