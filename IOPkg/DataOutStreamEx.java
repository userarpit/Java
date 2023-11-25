package IOPkg;

import java.io.*;
public class DataOutStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("testout2.txt"));
			dos.writeBoolean(false);
			dos.writeChar(65);
			dos.writeChars(new String("arpit"));
			dos.writeByte(65);
			dos.flush();
			dos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
