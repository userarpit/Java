package Stringpkg;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer( "2+3-1*8/4", "+*-/");
		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer( "2+3-1*8/4", "+*-/",true);
		System.out.println(st1.countTokens());
		
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}	
	}

}
