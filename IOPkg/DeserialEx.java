package IOPkg;
import java.io.*;
public class DeserialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student s1 = new Student(111,"Arpit");
		try {
		FileInputStream fis = new FileInputStream("testout");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student)ois.readObject();
		System.out.println("Student id " + s1.sid);
		System.out.println("Student name " + s1.name);
		System.out.println("School name " + s1.sname);
		ois.close();fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
