package test1;

import java.util.regex.Pattern;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[^ab]", "c"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9827032344"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "6827032344"));
	}

}
