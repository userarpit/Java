package IOPkg;
import java.io.*;
public class JavaPushBackStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PushbackInputStream pb = null;
		int i;
		try(PushbackInputStream pb = new PushbackInputStream(new FileInputStream("testout.txt"),8)) {
			
		
			i = pb.read();
			System.out.println((char)i);	
			pb.unread(i);
			pb.unread(65);
			pb.unread(66);
			pb.unread(67);
			i = pb.read();
			System.out.println((char)i);	
			while((i=pb.read()) != -1) {
				System.out.print((char)i);
			}
			//pb.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
