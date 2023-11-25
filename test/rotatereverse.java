package test;

public class rotatereverse {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		rotatearray(arr,25,6);
		printarray(arr);
	}
	
	

	static void rotatearray(int[] arr, int d, int n) {
		// TODO Auto-generated method stub
		d = d % n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}


	static void reverse(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	
	}
}
