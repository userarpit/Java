package Collection;
import java.util.*;
import java.util.function.BiConsumer;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(100, "Amit");
		map.put(101, null);
		map.put(102, "Rahul");
		
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println(m.hashCode());
			System.out.println("----");
			if((Integer)m.getKey() == 102) {
				m.setValue("Aakash");
			}
		}
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(200, "Amit");
		map1.put(201, "Vijay");
		map1.put(202, "Rahul");
		
		map.putAll(map1);
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue());
			System.out.print("||");
		}
		
		map.remove(101);
		map.putIfAbsent(101, "Ram");
		System.out.println();
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue());
			System.out.print("||");
		}
		System.out.println();
		System.out.println(map.toString());
		System.out.println(map);
		
		Set<Integer> s = map.keySet();
		
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ||");
		}
		System.out.println();
		try {
		map.compute(101, (key,val) -> val.toUpperCase());}
		catch (Exception e) {
			e.printStackTrace();
		}
		map.computeIfPresent(202, (key,val) -> val.toLowerCase());
		map.computeIfAbsent(203, (key) -> "Arpit");
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue());
			System.out.print("||");
		}
		System.out.println(map.containsKey(203));
		BiConsumer<Integer, String> bc = new MyBiConsumer();
		map.forEach(bc);
		System.out.println(map.get(202));
		System.out.println(map.getOrDefault(1011, "xxxxx"));
		System.out.println(map.hashCode());
		map.replaceAll((k, v) -> v.toUpperCase());
		System.out.println(map.toString());
		System.out.println(map.values());
		System.out.println(map.size());
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue());
			
			System.out.print("||");
		}
		 map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	}
}

class MyBiConsumer implements BiConsumer<Integer, String> {
	  
    public void accept(Integer k, String v)
    {
        System.out.println("Key: " + k
                           + "\tValue: " + v);
  
        /*if (.equals(k)) {
            System.out.println("Its the "
                               + "highest value\n");
        }*/
    }
}
