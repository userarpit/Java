package Reflection;

class Simple1{}    

public class Test1{    
 public static void main(String args[]) throws Exception {    
  Class c=Class.forName("java.lang.String");    
  System.out.println(c.getName());    
 }    
}    
