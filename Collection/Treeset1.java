package Collection;
import java.util.*; 

class Books implements Comparable<Books>{
	int id;
	String name;
	Books(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Books b) {
		if (this.id > b.id) {
			return -1;
		} else if(this.id<b.id){    
	        return 1;    
	    }else{    
	    return 0;    
	    }   
	}
}

class Treeset1{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 
  NavigableSet nv = al.descendingSet();
  Iterator<String> itr1 = nv.iterator();
  
  // Iterate over the elements using itr
  while (itr1.hasNext()) {
      System.out.println("Value: " + itr1.next() + " ");
  }
  
  SortedSet<String> s = al.subSet("Iam","Xicky");
Iterator<String> itr2 = s.iterator();
  
  // Iterate over the elements using itr
  while (itr2.hasNext()) {
      System.out.println("Value: " + itr2.next() + " ");
  }
  
  Books b1 = new Books(101,"Abc");
  Books b2 = new Books(102,"Def");
  TreeSet<Books> s1 = new TreeSet<Books>();
  s1.add(b2);
  
  Iterator<Books> i2 = s1.iterator();
  while (i2.hasNext()) {
      System.out.println("Value: " + i2.next().name + " ");
  }
  System.out.println(s1.pollLast().name);
 }  
}  