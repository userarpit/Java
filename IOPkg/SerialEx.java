package IOPkg;
import java.io.*;
public class SerialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(111,"Arpit","APS");
		try {
		FileOutputStream fos = new FileOutputStream("testout");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();oos.close();fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
