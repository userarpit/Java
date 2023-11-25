package test;

public class rotategcd {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		rotategcd rgcd = new rotategcd();
		
		rgcd.leftrotate(arr,14,12);
		rgcd.printarray(arr);
	}
	
	void leftrotate(int[] arr, int d, int n) {
		int k;
		d = d % n;
		for(int i=0;i < gcd.getgcd(n, d);i++) {
			int temp = arr[i];
			int j = i;
			//System.out.println(i);
			while(true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
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