package test1;

import java.util.StringTokenizer;

//import java.io. * ;
public class Main {
  public static void main(String[] args) {
	  
    StringBuffer str = new StringBuffer("ContentWriter");
    System.out.println(str.capacity());
    int len = str.length();
    System.out.println("Length : " + len);
    str.delete(2, 3);
    System.out.println(str);
    str.append(10);
    System.out.println(str);
    System.out.println(str.reverse());
    System.out.println(str.capacity());
    str.append(" java is the language");
    System.out.println(str.capacity());
    StringBuilder sbu = new StringBuilder("Arpit");
    String sa = "Priyank";
    System.out.println(sbu.hashCode());
    System.out.println(sa.hashCode());
    sbu.append(" Khandelwal");
    sa = sa + " Khandelwal";
    System.out.println(sbu.hashCode());
    System.out.println(sa.hashCode());
    Main m  =new Main();
    System.out.println(m);
    StringTokenizer st = new StringTokenizer("Java,is,a,high,level,language");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()) {
    	System.out.println(st.nextToken());
    }
    System.out.println(st.countTokens());
  }
  public String toString() {
	return "Main class object print";  
  }
}