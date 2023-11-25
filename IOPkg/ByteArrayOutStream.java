package IOPkg;
import java.io.*;
public class ByteArrayOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos1 = new FileOutputStream("testout1.txt");
			FileOutputStream fos2 = new FileOutputStream("testout2.txt",true);
			
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(65);
			baos.writeTo(fos1);
			baos.writeTo(fos2);
			
			baos.flush();
			baos.close();
			fos1.close();
			fos2.close();
			System.out.println(baos.size());
			System.out.println(baos.toString());
			baos.reset();
			System.out.println(baos.size());
			System.out.println(baos.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
