package Arraypkg;

public class multiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=2;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sum(arr));
		System.out.println(arr.getClass());
		System.out.println(arr.length);
//		int[][] arr1 = new int[][2];
	}
	
	static int sum(int[][] arr) {
		int total = 0;
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=2;j++) {
				total += arr[i][j];
			}
		}
		return total;
	}

}
