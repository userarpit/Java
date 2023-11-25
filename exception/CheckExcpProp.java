package exception;
import java.io.*;

public class CheckExcpProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckExcpProp cp = new CheckExcpProp();
		try {
			cp.p();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	void p() throws IOException{
		n();
	}
	void n() throws IOException{
		m();
	}
	void m() throws IOException,ArithmeticException{
		//int a = 50/0;
		/*try {
			throw new java.io.IOException("device error");	
		}
		catch(Exception IO) {
			System.out.println(IO);
		}*/
		throw new IOException("check propogate");
	}
	

}
