package Vectors;
import java.util.*;  
public class vector {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<String>();    
		  
		//Put elements in vector 
		vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        vec.add("cat");
        
        System.out.println("Vector element are : "+vec);
        System.out.println("Size of vector : "+vec.size());
        System.out.println("Capacity of the vector : "+vec.capacity());
        
        vec.remove("Tiger");
        
        System.out.println("Vector element are : "+vec);
        
        vec.addElement("Tiger");
        System.out.println("Vector element are : "+vec);
        
        
        
	}
}
