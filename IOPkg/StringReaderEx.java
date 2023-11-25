package IOPkg;
import java.io.*;
public class StringReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		try(StringReader sr = new StringReader(s)) { 
		System.out.println((char)sr.read());
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
