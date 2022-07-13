package JavaQueue;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> names=new LinkedList<String>();
		names.add("Athira");
		names.add("Joseph");
		names.add("Sachin");
	    names.add("Saurabh");
	    names.add("Virat");
	    
	    System.out.println(" Elements of the Queues :"+names);
	    
	    System.out.println("Removed element is : "+names.remove());
	    
	    System.out.println("Head element: " +names.element());
	    
	    System.out.println("Poll() :"+names.poll());
	}

}
