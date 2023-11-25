package Stringpkg;
import java.lang.*;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("example");
        // creating Java string by new keyword
        // this statement create two object i.e
        // first the object is created in heap
        // memory area and second the object is
        // created in String constant pool.
 
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str += " arpit";
        System.out.println(System.identityHashCode(str));
	
	// StringBuilder
        
     // TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder("example");
        // creating Java string by new keyword
        // this statement create two object i.e
        // first the object is created in heap
        // memory area and second the object is
        // created in String constant pool.
 
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
//        str += " arpit";
        str1.append("arpit");
        System.out.println(System.identityHashCode(str1));
        
//        CharSequence charSequence = new StringBuilder("baeldung");
//        String castedString = (String) charSequence;
//        
        StringBuffer s = new StringBuffer(10);
        s.append("Arpit Khandelwal");
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
        s.insert(4, "khan");
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
//        System.out.println(s.reverse());
        System.out.println(s);
        System.out.println(s.codePointAt(8));
        System.out.println(s.codePointCount(2, 6));
        System.out.println(s.indexOf("pr4"));
        char[] c = new char[5];
        s.getChars(2, 7, c, 0);
        System.out.println(c);
	}

}
