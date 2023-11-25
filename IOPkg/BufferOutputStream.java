package IOPkg;

import java.io.*;

public class BufferOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("testout.txt",true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);	
			bos.write(97);
			bos.flush();
			bos.close();fos.close();
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}

}
