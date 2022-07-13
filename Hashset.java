package Hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet contains unique elements only
		HashSet<String> hset=new HashSet<String>();
		
		//Adding element to the hashSet
		hset.add("Ravi");  
		hset.add("Vijay");  
	    hset.add("Ravi");  
	    hset.add("Ajay"); 
		
		System.out.println("Hashset");
		 Iterator<String> i=hset.iterator();  
         while(i.hasNext())  {  
        	 System.out.println(i.next());  
         }  
		
         System.out.println("=======================");
		
		//TreeSet class contains unique elements 
		TreeSet<String> tset=new TreeSet<String>();
		//Adding element to the TreeSet
		tset.add("Ravi");  
		tset.add("Vijay");  
	    tset.add("Ravi");  
	    tset.add("Ajay");  
		
	    System.out.println("Treeset");
	    Iterator<String> itr=tset.iterator();  
	    while(itr.hasNext()){  
	     System.out.println(itr.next());  
	    }  
	    
	    System.out.println("===========================");
	    
	    //TreeMap contains only unique elements.
	    //TreeMap maintains ascending order by key
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		//Putting element to the TreeMap
		tmap.put(1, "saurabh");
		tmap.put(5,"Amit");    
	    tmap.put(2,"Ravi");    
	    tmap.put(4,"Vijay");    
        tmap.put(3,"Rahul"); 
        tmap.put(1, "saurabh");
        System.out.println("Treemap");
	      for(Entry<Integer, String> m:tmap.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	    System.out.println("============================");  
	}

}
