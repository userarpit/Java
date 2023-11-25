package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
interface my{}
class Test3{  
	  public static void main(String args[]){  
	   Class c = boolean.class;   
	   System.out.println(c.getName());  
	  
	   Class c2 = Simple.class;   
	   System.out.println(c2.getName());
	   
	   
	   Field[] f = c2.getDeclaredFields();
	   for(Field f1:f) {
	 	  System.out.println(f1.getName());
	   }
	   System.out.println(c.isPrimitive());
	 
	   Class c3 = my.class;
	   System.out.println("interface -> " + c3.isInterface());
	   
	   Method[] method = c2.getDeclaredMethods();
	   for(Method m1:method) {
	 	  System.out.println(m1.getParameterCount());
	 	  System.out.println(m1.getName());
	   }
	   //Constructor c4 = c2.getConstructor(null)
	   
	  }  
	}  
