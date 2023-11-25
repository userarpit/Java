package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Simple extends Thread{
	
	int a;
	float b;
	Simple() {
		System.out.println(3);
	}
	private void check(int a, int b) {
		System.out.println(a * b);
	}
	Simple(int c){
		System.out.println(c);
	}
}  

class Test{  
  void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName()); 
  System.out.println(c.isInterface());
  System.out.println(c.isArray());
  System.out.println(c.isPrimitive());
  Class superclass = c.getSuperclass();
  System.out.println(superclass.getName());
  Field[] f = c.getDeclaredFields();
  for(Field f1:f) {
	  System.out.println(f1.getName());
  }
  
  Constructor[] cons = c.getDeclaredConstructors();
  for(Constructor c1:cons) {
	  System.out.println(c1.getParameterCount());
	  System.out.println(c1.getDeclaringClass());
  }
  }  
  public static void main(String args[]){  
   Simple s = new Simple();
   int a=10;
   Test t=new Test();  
   t.printName(s);  
 }  
}  
