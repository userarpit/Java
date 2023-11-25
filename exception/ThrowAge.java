package exception;

public class ThrowAge {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//ThrowAge.validate((short) 13);
		
		//ThrowAge.validate((short) 23);
		short a = 10;
		try {
			if(a < 18) {
				throw new ArithmeticException(a + " - Age is less than 18; it can not be vote");
			}
			else {
				System.out.println(a + " - Age is greater than 18; it can vote");
			}
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
	static void validate(short a) {
		try {
			if(a < 18) {
				throw new ArithmeticException(a + " - Age is less than 18; it can not be vote");
			}
			else {
				System.out.println(a + " - Age is greater than 18; it can vote");
			}
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
	}
}