package IOPkg;
import java.io.*;

public class BuffeReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//BufferedReader r = new BufferedReader(new FileReader("testout1.txt"));
			InputStreamReader r=new InputStreamReader(System.in); 
			BufferedReader br = new BufferedReader(r);
			//System.out.println(br.ready());
			String s=null;
			char[] c = new char[20];
			System.out.println("Enter data");
			s =br.readLine();
			c=s.toCharArray();
			System.out.println(c[0]);
			System.out.println(br.markSupported());
			while(!s.equals("stop")) {
								
				System.out.println("Enter data");
				s=br.readLine();
				System.out.println(s);
				System.out.println("Enter an integer");
				 
		        // Taking integer input
		        int a = Integer.parseInt(br.readLine());
		        System.out.println(a);
			}
			
			br.close();
			r.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
