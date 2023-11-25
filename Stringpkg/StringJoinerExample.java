package Stringpkg;
import java.lang.*;
import java.util.*;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Ram");
		al.add("Shyam");
		al.add("Alice");
		al.add("Bob");
		
		StringJoiner sj = new StringJoiner(":");
		
		sj.add(al.get(0)).add(al.get(1));
		System.out.println(sj);
		System.out.println(sj.length());
		
//		sj.setEmptyValue("empty");
//		System.out.println(sj.length());
	}

}
