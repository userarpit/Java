package IOPkg;
import java.io.*;
public class ByteArrayInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis1 = new FileInputStream("testout.txt");
			byte[] b = new byte[fis1.available()];
			fis1.read(b);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(b);
			for(byte b2: b) {
				System.out.print((char)b2);	
			}

			bais.close();
			fis1.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
