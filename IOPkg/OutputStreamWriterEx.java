package IOPkg;
import java.io.*;
public class OutputStreamWriterEx {

	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		try {
			OutputStream os = new FileOutputStream("testout");
			osw = new OutputStreamWriter(os);
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(osw.getEncoding());	
		try {
			osw.flush();
			osw.close();	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
