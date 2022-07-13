package Sortingcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		
		int[] arr= {12,13,2,3,5,0};
		Arrays.sort(arr);
		System.out.println("Sorted array are: "+arr);
		System.out.println(Arrays.toString(arr));
		
		String[] names= {"UP","MP","AP"};
		Arrays.sort(names);
		System.out.println("Sorted string "+names);
		System.out.println(Arrays.toString(names));
		
		List<String> colors=new ArrayList<String>();
		colors.add("Orange");
		colors.add("White");
		colors.add("Purple");
		colors.add("Indigo");
		
		Collections.sort(colors);
		System.out.println("Sorted list are : "+colors);
	}

}
