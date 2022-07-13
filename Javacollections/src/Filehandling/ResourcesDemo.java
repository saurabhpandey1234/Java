package Filehandling;

import java.io.*;
import java.util.*;
public class ResourcesDemo {

	static FileInputStream file;
	
	static void Divide() throws Exception {
		
		file=new FileInputStream("/home/saurabh.pandey3/Downloads/Untitled Document 1");
		
		try{
			Scanner sc=new Scanner(file);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a/c);
		}
		finally {
		file.close();
		}
	}
	public static void main(String[] args) throws Exception {
		
		Divide();
	}

}
