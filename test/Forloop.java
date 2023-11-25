package test;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		String[] names = {"Java","C","C++","Python","JavaScript"};
		for(int i = 0;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		for(String s:names) {
			System.out.println(s);
		}
		int j=1;
		while(j<=10) {
			System.out.println(6 * j);
			j += 1;
		}
		System.out.println(Integer.MAX_VALUE);
		int h = 100;
		for (int t = 1;t <= h;t++) {
			if ((t % 17) == 0) {
				System.out.println(t);
			}
		}
		sum=0;
	int[] arr = {2,3,6,3,6,34,75,345,45};
	for (int i : arr) {
		if (sum > 200) {
			break;
		}
		if (i == 75) {
			continue;
		}
		
	sum += i;
	System.out.println(sum + " " + i);
	}
	System.out.println(sum);
		
	}	    
}
