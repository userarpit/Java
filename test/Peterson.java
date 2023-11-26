package test;

public class Peterson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long petersonnum = 145;
			long temp = petersonnum;
			int remainder;
			long sum = 0;
			while(temp != 0) {
				remainder = (int)temp % 10;
				sum += fact(remainder);
				temp = temp /10;
			}
			if (sum == petersonnum)
				System.out.println(petersonnum  + " is a Peterson Number");
			else
				System.out.println(petersonnum  + " is not a Peterson Number");
			
	}

	static long fact(int i) {
		if (i == 0)
			return 1;
		if (i == 1) 
			return 1;
		else
			return i * fact(i-1);
	}
}
