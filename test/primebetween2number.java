package test;

public class primebetween2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1000;
		int end = 2000;
		int count=0;
		for(int i=start;i<=end;i++) {
			if (primebetween2number.checkprime(i))
				count += 1;
				System.out.println(i);
			}
		System.out.println("total prime numbers between 1000 and 2000 = " + count);
		}
	
	static boolean checkprime(int i) {
		if (i == 0 || i == 1)
			return false;
		int m = i/2;
		for(int j=2;j<=m;j++) {
			if (i%j == 0) {
				return false;	
			}
		}
		return true;			
	}
	
}
