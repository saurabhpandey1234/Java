package defaultpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.studentmanage.Student;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome To Student Management App");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to Add Student");
			System.out.println("press 2 to Delete Student");
			System.out.println("press 3 to Display Student");
			System.out.println("Press 4 to Exit");
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				//add
				
				System.out.println("Enter User Name :");
				String name=br.readLine();
				
				System.out.println("Enter User Phone : ");
				String phone =br.readLine();
				
				System.out.println("Enter The City");
				String city=br.readLine();
				
				//create student
				
				Student st =new Student(name, phone, city);
				
				System.out.println(st);
				
			}
			else if(c==2) {
				//delete
			}
			else if(c==3) {
				//display
			}
			else if(c==4) {
				//exit
				break;
			}
			else {
				
			}
		}
		System.out.println("Thank You");
	}

}
