package IOPkg;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
public class SeqInputStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int i;
		try {
			FileInputStream fis1 = new FileInputStream("testout.txt");
			FileInputStream fis2 = new FileInputStream("testout1.txt");
			FileInputStream fis3 = new FileInputStream("testout2.txt");	
			Vector<FileInputStream> v = new Vector<FileInputStream>();
			v.add(fis1);
			v.add(fis2);
			v.add(fis3);
			
			System.out.println(v.contains(fis3));
			System.out.println(v.capacity());
			System.out.println(v.lastElement());
			
			Enumeration<FileInputStream> e = v.elements();
			
			SequenceInputStream bin=new SequenceInputStream(e);  
			int i = 0;
			while((i=bin.read())!=-1){    
				System.out.print((char)i);    
			}
			bin.close();
			fis1.close();
			fis2.close();
			fis3.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}

}
