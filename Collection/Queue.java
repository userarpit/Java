package Collection;

import java.util.*;
public class Queue {
	
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Amit Sharma");
		pq.add("Vijay");
		pq.add("Raj");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(pq.remove());
		System.out.println(pq.size());
		pq.remove();
		pq.remove();
		System.out.println(pq.size());
	//	System.out.println(pq.remove());
		System.out.println(pq.poll());
		
		Deque<String> d = new ArrayDeque<String>();
		d.add("Arpit");
		d.add("Amit");
		d.add("Charlie");
		for(String s : d) {
			System.out.println(s);
		}
		
		d.addLast("Delhi");
		d.addFirst("1ion");

		
		d.offer("Elephant");
		d.offerFirst("0");
		d.pop();
		d.push("q");
		d.push("D");
		System.out.println("----");
		for(String s : d) {
			System.out.println(s);
		}
		System.out.println("----");
		d.removeLastOccurrence("D");
		for(String s : d) {
			System.out.println(s);
		}
		d.removeIf(n -> (n.charAt(0) == 'A'));
		for(String s : d) {
			System.out.println(s);
		}
		System.out.println(d.size());
		Spliterator<String> spl = d.spliterator();
		
		//spl.forEachRemaining((n) -> System.out.println(n));
		System.out.println(spl.characteristics());
		System.out.println(spl.estimateSize());
		System.out.println(spl.getExactSizeIfKnown());
		//Spliterator<String> spl1 = spl.trySplit();
		//spl.forEachRemaining((n) -> System.out.println(n));
		//spl1.forEachRemaining((n) -> System.out.println(n));
		//System.out.println(spl1);
		
		for(String s : d) {
			System.out.println(s);
		}
		System.out.println("---------------");
		while(spl.tryAdvance((n) -> System.out.println(n)));
		System.out.println(d);
		d.clear();
		System.out.println(d);
		
	}
}
