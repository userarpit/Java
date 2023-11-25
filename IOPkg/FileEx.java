package IOPkg;
import java.io.File;
public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/exception");
		File f1 = new File(f,"CheckExcpProp.java");
	/*	if(!f.exists()) {
			f.mkdirs();
		}*/
		//System.out.println(f.length());
		//f.renameTo(new File("testout3.txt"));
		//f.delete();
	/*	File[] files= f.listFiles();
		for(File f1: files) {
			System.out.print("   " + f1.getName());
			System.out.println("   " + f1.isDirectory());
		}
	*/	System.out.println(File.separator);
	System.out.println(f1.getAbsolutePath());
	System.out.println(f1.lastModified());
	System.out.println(f1.toString());
	System.out.print(f1.getName());
	}

}
