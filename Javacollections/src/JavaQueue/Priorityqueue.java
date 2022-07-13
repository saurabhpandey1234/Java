package JavaQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> name=new PriorityQueue<String>();  
		
		name.add("Saurabh");
		name.add("Amit");  
		name.add("Vijay");  
		name.add("Karan");  
		name.add("Jai");  
		name.add("Rahul");  
		
		System.out.println("All priority Queue : "+name.element());
		
		System.out.println("iterating the queue elements:");  
		Iterator itr=name.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
	}

}
