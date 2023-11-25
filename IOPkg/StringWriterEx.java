package IOPkg;
import java.io.*;
public class StringWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(StringWriter sw = new StringWriter()) { 
		sw.write("abc");
		sw.write("def");
		sw.append('e');
		System.out.println(sw.toString());
		System.out.println(sw.getBuffer());
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
