package Collection;

import java.util.*;

public class ArrayToQueue {
   public static void main(String[] args) {
    //declare a Queue   
	   String[] arr = new String[3];
	   arr[0] = "Amit";
	   arr[1] = "Ajay";
	   arr[2] = "Ankit";
	  Deque<String> d = new ArrayDeque<String>();
    //initialize the queue with values
    Collections.addAll(d, arr);
    System.out.println("The Queue contents:" + d);
    }
}