package JavaQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Saurabh");
		deque.add("Amit");  
		deque.add("Vijay");  
		deque.add("Karan");  
		deque.add("Jai");  
		deque.add("Rahul");
		 
		deque.offerFirst("Virat");
		deque.offerFirst("Aman");
		
		
		for (String str : deque) {  
			   System.out.println(str);  
	    }  
		
		
	}

}
