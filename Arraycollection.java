package Javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraycollection {

	public static void main(String[] args) {
		ArrayList<String> NameList=new ArrayList<String>();
		NameList.add("Saurabh");
		NameList.add("Sachin");
		NameList.add("Sarvesh");
		NameList.add("Pandey");
		NameList.add("Raebareli");
		System.out.println("Size of the ArrayList : "+ NameList.size());
		
		ArrayList<String> Countries=new ArrayList<String>();
		NameList.add("India");
		NameList.add("Poland");
		NameList.add("Germany");
		
		
		NameList.addAll(Countries);
		Collections.sort(NameList);
		System.out.println(NameList);
		
		
		
	}

}
