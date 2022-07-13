package Linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	 
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the linked list
		LinkedList<String> list=new LinkedList<String>();
		list.add("C");
		list.add("Python");
		list.add("Java");
		
		//adding the element at the beg
		list.addFirst("C++");
		list.addFirst("Saurabh");
		list.addFirst("Pandey");
		
		//adding last
		list.addLast("Pointer");
		
		//adding at any positions
		list.add(3,"Learning");
		
		//iterator for the traversing the linked list
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=============================");
		
		
		//remove first element
		list.removeFirst();
		
		//remove last element
		list.removeLast();
		
		//remove at particular position;
		list.remove(2);
		
		//iterator for the traversing the linked list
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		//get first and last element
		System.out.println("first element: "+list.getFirst());
		System.out.println("last element: "+list.getLast());
		System.out.println("Specific element: "+list.get(2));
		
		
		
		//search in the linked list
		System.out.println("Search in the linked list");
		int ans = -1;
		String element="Java";  
        // Traversing through the Linked List
        for (int i = 0; i < list.size(); i++) {
        	String llElement = list.get(i);
            if (llElement == element) {
                ans = i;
                break;
            }
        }
        // Checking if the element is present in the Linked
        // List
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found in Linked List" );
        }
        
        
        //Sublist of linked list
        List<String> list1 =list.subList(2, 4);
		
        //iterator the linked list reverse order
        Iterator<String> iter4 = list.descendingIterator();
        while (iter4.hasNext()) 
        {
            System.out.println(iter4.next());
        }
        
        //replace the value with new value
        list.set(2, "NEW VALUE");
        
         // Creating clone of another list
        LinkedList<String> list2 = new LinkedList<String>();
        list2 = (LinkedList)list.clone();
        
        //last occurrence of the element
        System.out.println("LastIndex of Java:"+list.lastIndexOf("Java"));
        
       // push Element the list
        list.push("NEW ELEMENTS");
        
        //poll
        System.out.println("Element removed: "+list.poll());
        
        //pollFirst
        System.out.println("Element removed pollfirst: "+list.pollFirst());
        
        //pollLast
        System.out.println("Element removed polllast: "+list.pollLast());
         
        //peek()
        System.out.println("Peek : "+list.peek());
        System.out.println("LinkedList elements: "+list);
        
        //peekFirst()
        System.out.println("peekfist : "+list.peekFirst());
        System.out.println("LinkedList elements: "+list);
    
        //peekLast()
        System.out.println("peekLast : "+list.peekLast());
        System.out.println("LinkedList elements: "+list);
	}

	

}
