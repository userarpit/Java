package test;

public class rotategcdfwd {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		rotategcdfwd rgcd = new rotategcdfwd();
		
		rgcd.leftrotate(arr,5,12);
		rgcd.printarray(arr);
	}
	
	void leftrotate(int[] arr, int d, int n) {
		int k;
		for(int i=0;i < gcd.getgcd(n, d);i++) {
			int temp = arr[n-i-1];
			int j = n-i-1;
			//System.out.println(i);
			while(true) {
				k = j - d;
				//System.out.println(" k bef" + k);
				if (k < 0)
					k = n + k;
				//System.out.println("k between" + k);
				if (k == n-i-1)
					break;
				arr[j] = arr[k];
				j = k;
				//System.out.println(" k aft" + k);
				//System.out.println(j);
			}
			arr[j] = temp;
		}
	}
		
	void printarray(int[] arr) {
		for(int i = 0;i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}