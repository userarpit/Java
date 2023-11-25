package test;

public class Pattern {

	public static void main(String[] args) {
		// pyramid
			int n = 10;
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=(n-i);k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		// right triangle 	
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=(2*(n-i));k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			// left triangle 
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		// Diamond
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=(n-i);k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n-1;i>=1;i--) {
				for(int k=1;k<=(n-i);k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		// Downward triangle start pattern
			System.out.println();
			
			for(int i=10;i>=1;i--) {
				
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		// Mirrored Right Triangle Star Pattern	
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=(n-i);k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		// Reverse Pyramid Star Pattern
			System.out.println();

			for(int i=n;i>=1;i--) {
				for(int k=n;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}	
		// Right Down Mirror Star Pattern
			System.out.println();

			for(int i=n;i>=1;i--) {
				for(int k=n;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
		// Right Pascal's Triangle
			System.out.println();

			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=n-1;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		// Left Pascal's Triangle
			System.out.println();

			for(int i=1;i<=n;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n-1;i>=1;i--) {
				for(int k=n;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		// Sandglass Star Pattern
			System.out.println();
			for(int i=n;i>=1;i--) {
				for(int k=n;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		// Alphabet Star Pattern
			System.out.println();
			for(int i=n;i>=1;i--) {
				if (i == n/2 || i == n || i == 1 ) {
					for(int j=1;j<=n;j++) {
						System.out.print("*");
					}
				}
				else {
					for(int k=1;k<=n;k++) {
						if (k == 1 || k == n)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				}
				System.out.println();
			}
		// Triangle star
			System.out.println();
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++) {
					if (j == 1 || j == (2*i-1) || (i == n))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		// Down Triangle Pattern
			System.out.println();
			for(int i=n;i>=1;i--) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++) {
					if (j == 1 || j == (2*i-1) || (i == n))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		// Diamond Star Pattern
			System.out.println();
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++) {
					if (j == 1 || j == (2*i-1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
			for(int i=n-1;i>=1;i--) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++) {
					if (j == 1 || j == (2*i-1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
	}

}
