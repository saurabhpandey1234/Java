package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class FileHandlingOperation {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		//File file=new File("Newfile.txt");
		
		//file is present or not
		/*
		 * // try { // //trying to create a file based on the object // boolean
		 * value=file.createNewFile(); // // if(value) { //
		 * System.out.println("New File is created"); // } // else { //
		 * System.out.println("The file already exits"); // } // } // catch(Exception e)
		 * { // e.getStackTrace(); //
		 * System.out.println("Excetion hanled file can't created"); // }
		 */	
		
		//want to open file
//		char[] array=new char[1000];
		/*
		 * try { FileReader input=new FileReader("Newfile.txt"); try {
		 * input.read(array); System.out.println("Data int file");
		 * System.out.println(array); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); }
		 */
	
		
		
		
		/*
		 * try { FileWriter fwrite = new FileWriter("Newfile.txt");
		 * 
		 * fwrite.
		 * write("A named location used to store related information is referred to as a File."
		 * ); System.out.println("Unexpected error occurred"); // Closing the stream
		 * fwrite.close();
		 * 
		 * } catch (Exception e) { System.out.println("Unexpected error occurred");
		 * e.printStackTrace(); }
		 */
		
		
		
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File("Newfile.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();
             String v = f1.getName();
             
             System.out.println("File name: "+v);
             
             long len = f1.length();
             System.out.println("File length : "+len);
              
        } 
		catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
	}

}
