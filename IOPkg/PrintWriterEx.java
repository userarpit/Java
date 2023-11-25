package IOPkg;
import java.io.*;
public class PrintWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("abc");
		pw.flush();
		pw.close();
			
	}

}
