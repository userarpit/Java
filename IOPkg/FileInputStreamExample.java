package IOPkg;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("testout.txt");
			byte[] b = new byte[fis.available()];
			fis.read(b);
		//	String s = new String(b);
			for(byte b1: b) {
				System.out.print((char)b1);	
			}
			
			
		//	System.out.println(fis.available());
			fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
