package IOPkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c = new Country();
		c.setCode(111);
		c.setName("IND");
		Country c1 = new Country();
		try {
			FileOutputStream fos = new FileOutputStream("testout");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			c.writeExternal(oos);
			
			oos.flush();oos.close();fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		try {
			FileInputStream fis = new FileInputStream("testout");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			c1.readExternal(ois);
			System.out.println(c.getCode());
			System.out.println(c.getName());
			ois.close();fis.close();
		//	assertTrue(c1.getCode() == c.getCode());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
