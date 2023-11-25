package IOPkg;
import java.io.*;
public class WriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w = new BufferedWriter(new FileWriter("testout1.txt"));
			w.write("Arpit Khandelwal");
			w.write(97);
			
			w.write(System.getProperty("line.separator"));
			
			
			w.write("abcde Khandelwal");
			w.flush();w.close();
			//again
			BufferedWriter bw = new BufferedWriter(new FileWriter("testout1.txt",true));
			bw.newLine();
			bw.write("in new line");
			
			
			bw.flush();bw.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
