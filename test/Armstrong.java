package test;

public class Armstrong {
	
	public static void main(String[] args) {
		int start = 1;
		int end = 2000;
		for(int i = start;i<=end;i++) {
			if(armstrong(i))
				System.out.println(i);
		}
	}
	
	public static boolean armstrong(int i) {
		int length=0;
		int temp = i;
		while (temp > 0) {
			length++;
			temp = temp / 10;
		}
		temp = i;
		int sum = 0;
		int digit;
		for(int m=1;m<=length;m++ ) {
			digit = temp % 10; 
			sum += Math.pow(digit, length);
			temp = temp / 10;
		}
		if (sum == i)
			return true;
		else
			return false;
	}
}
