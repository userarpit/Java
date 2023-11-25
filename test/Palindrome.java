package test;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 15355655351L;
		boolean palin= true;
		Long x = a;
		String s = x.toString();
		long[] arr = new long[s.length()];
		int i=0;
		while(a !=0) {
			arr[i] = a%10;
			a = a / 10;
			i+=1;
		}
		int start = 0;
		int end = s.length() - 1;
		while(start < end) {
			if (arr[start] == arr[end]) {
			    start++;
			    end--;
			}
			else {
				palin = false;
			    break;
			}
		}
		if(palin)
			System.out.println("palindrome");	
		else
			System.out.println("not a palindrome");	
	}
}