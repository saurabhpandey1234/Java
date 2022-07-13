package Hashmap;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		
		//Creating Hashmap <key,value_pair>;
		 HashMap<Integer,String> map=new HashMap<Integer,String>();    
		  
		//Put elements in Map 
		 map.put(1,"Mango");   
		 map.put(2,"Apple");    
	     map.put(3,"Banana");   
	     map.put(4,"Grapes");   
	     map.put(5,"Mango");   
	     
	     System.out.println("Hashmap element "+map);

	}

}
