package IOPkg;
import java.io.*;
public class Student implements Serializable{

	int sid;
	String name;
	transient String sname;
	Student(int sid, String name,String sname) {
		this.sid = sid;
		this.name = name;
		this.sname = sname;
	}
}
