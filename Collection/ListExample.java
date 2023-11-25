package Collection;
import java.util.*;

public class ListExample {
	static LinkedList<Student> lls = null;
	/*LinkedList get() {
		return lls;
	}
	*/
	static void add(Short rollno, String name) {
		lls.add(new Student(rollno,name));
	}
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Apple");
		for(String s:l) {
			System.out.println(s);
		}
		
		
		l.add(2, "Banana");
		for(String s:l) {
			System.out.println(s);
		}
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Grapes");
		arr.add("Leechy");
		arr.add("Papaya");
		arr.add("Papay1");
		arr.add("Papay2");
		arr.add("Papay3");
		arr.add("Papay4");
		
		System.out.println("----");
		l.addAll(2, arr);
		for(String s:l) {
			System.out.println(s);
		}
		
		Iterator<String> i1 = l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		l.add("Apple");
		for(String s:l) {
			System.out.println(s);
		}
		System.out.println(arr);
		arr.add("Apple");
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		arr.replaceAll((n) -> n.toLowerCase());
		System.out.println(arr);
		arr.sort(Comparator.reverseOrder());
		System.out.println(arr);
		
		//System.out.println(l);
		ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.print("ArrayDeque: ");

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
	}
         lls = new LinkedList<>();
        add((short)101,"Ajay");        
        add((short)102,"Amit");
        add((short)103,"Kiran");
        add((short)104,"ABCD");
        add((short)105,"EFGH");
        
        Iterator<Student> is = lls.descendingIterator();
        
        while(is.hasNext()) {
        	Student s2 = is.next();
        	System.out.println(s2.rollno);
        	System.out.println(s2.name);
        }
        System.out.println("----");
        for(Student s2 : lls) {
        	System.out.println(s2.rollno);
        	System.out.println(s2.name);
        }
      //  System.out.println(lls.indexOf(s1));
        System.out.println("----");
        List<Student> sublist1 = lls.subList(2, 5);
        for(Student s3:sublist1) {
        	System.out.println(s3.rollno);
        	System.out.println(s3.name);
        }
	}
}

class Student {
	short rollno;
	String name;
	Student (short rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}
