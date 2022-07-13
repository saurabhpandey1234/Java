package Day4;

import java.util.Scanner;

public class Studentdetail {
	int rolno;
	String firstname;
	String secondname;
	String city;
	String state;
	int street;
	
	public Studentdetail(int rolno, String firstname, String secondname, String city, String state, int street) {
		super();
		this.rolno = rolno;
		this.firstname = firstname;
		this.secondname = secondname;
		this.city = city;
		this.state = state;
		this.street = street;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter rollno");
		int roll=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter fname");
		String fname=input.nextLine();
		
		System.out.println("Enter lname");
		String lname=input.nextLine();
		
		System.out.println("Enter city");
		String city=input.nextLine();
		
		System.out.println("Enter state");
		String state=input.nextLine();
		
		System.out.println("Enter street");
		int street=input.nextInt();
		
		System.out.println("\n"+ roll
				+ "\n"+fname 
				+"\n"+ lname
				+"\n "+city
				+"\n"+state
				+"\n"+street);
		input.close();
	}

}
