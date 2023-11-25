package IOPkg;
import java.io.*;

public class WriteToFile {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		PrintStream o = new PrintStream(new File("A.txt"));
		System.setOut(o);
		System.out.println("arpit");
	}

}
