package Collection;
import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		Iterator<String> itr=set1.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
			
		}
		
		TreeSet<Integer> tsi = new TreeSet<>();
		tsi.add(1);
		tsi.add(2);
		tsi.add(3);
		tsi.add(4);
		Spliterator<Integer> spl = tsi.spliterator();
		while(spl.tryAdvance((n) -> System.out.println(n)));
		
		HashSet<Student> hs = new HashSet<>();
		
		Student s1=new Student((short)101,"Ajay");
        hs.add(s1);
        hs.add(new Student((short)102,"Amit"));
        hs.add(new Student((short)103,"Kiran"));
        hs.add(new Student((short)104,"ABCD"));
        hs.add(new Student((short)105,"EFGH"));
        
        System.out.println(hs.isEmpty());
        Spliterator<Student> splhs = hs.spliterator();
        while(splhs.tryAdvance((n) -> System.out.println(n.name + " " + n.rollno)));
        hs.remove(s1);
        Spliterator<Student> splhs1 = hs.spliterator();
        while(splhs1.tryAdvance((n) -> System.out.println(n.name + " " + n.rollno)));
        
		
	}
}