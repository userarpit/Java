package IOPkg;

import java.util.Scanner;
import java.io.*;
public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name - ");
		/*Console c = System.console();
		if (c == null) {
			System.out.println("console is not available");
			System.exit(0);
		}
		char[] ch = c.readPassword();
		for(char c1:ch) {
			System.out.println(c1);
		}*/
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		sc.close();
		System.out.println("welcome " + s);
	}

}
