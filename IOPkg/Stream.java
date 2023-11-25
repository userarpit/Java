package IOPkg;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 65;
		System.out.println("output");
		System.err.println("error in red");
		
		try {
			i = System.in.read();	
		}
		catch(Exception e) { e.printStackTrace();}
		
		System.out.println((char)i);
	}

}
