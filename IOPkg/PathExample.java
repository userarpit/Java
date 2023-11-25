package IOPkg;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class PathExample {
	public static void main(String[] args) {
		
		Path current = Paths.get("/Users/masterarpit/eclipse-workspace/Programs/testout1.txt");
		Path root = Paths.get("/Users");
		Path invalid = Paths.get("/Users/masterarpit/Arpit/a.txt");
		System.out.println(current.toAbsolutePath());
		System.out.println(current.isAbsolute());
		System.out.println(current.toString());
		System.out.println(current.getFileSystem());
		System.out.println(current.getFileName());
		System.out.println(current.getRoot());
		System.out.println(current.getParent());
		
		System.out.println("********");
		
		Path f = current.relativize(root);
		Path f1 = root.relativize(current);
		
		System.out.println(f);
		System.out.println(f1);
		
		Path f2 = current.normalize();
		System.out.println(f2.toString());
	/*	Path parent = Paths.get("..");
		System.out.println(parent.toAbsolutePath());*/
		System.out.println(Files.exists(invalid, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS}));
		
	/*	try {
			Files.createDirectory(invalid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			Files.copy(current,invalid,StandardCopyOption.REPLACE_EXISTING);
			Files.delete(invalid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(StandardCopyOption.valueOf(null))
	}
}
