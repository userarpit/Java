package test;

public class rotate {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};  
		
		rotate r = new rotate();
		r.leftrotate(arr, 1,5);
		r.print(arr);	
	}
	
	void leftrotate(int[] arr, int n, int d) {
		int i;
		for(i = 0; i < n; i++) {
			rotatebyone(arr,d);
		}
	}
	
	void rotatebyone(int[] arr, int d) {
		int temp,j;
		temp = arr[0];
		for(j=0; j< d-1; j++) {
			arr[j] = arr[j+1];
		}
		arr[j] = temp;
	}
	
	void print(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
