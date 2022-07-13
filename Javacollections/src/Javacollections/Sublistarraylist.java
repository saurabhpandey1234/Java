package Javacollections;

import java.util.ArrayList;
import java.util.List;

public class Sublistarraylist {

	public static void main(String[] args) {
		ArrayList<String> NameList=new ArrayList<String>();
		NameList.add("Saurabh");
		NameList.add("Sachin");
		NameList.add("Sarvesh");
		NameList.add("Pandey");
		NameList.add("Raebareli");
		System.out.println("Original List "+NameList);
		
		List<String> List=NameList.subList(1, 4);
		System.out.println("Sublist"+List);

	}

}
