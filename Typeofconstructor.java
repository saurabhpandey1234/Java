package Day4;
import java.util.Scanner;
public class Typeofconstructor {

	int empid;
	String empfname;
	String emplname;
	int empdesk;
	String location;
	int pincode;
	
	public Typeofconstructor(int empid,String empfname,String emplname,int empdesk,String location,int pincode){
		this.empid=empid;
		this.empfname=empfname;
		this.emplname=emplname;
		this.empdesk=empdesk;
		this.location=location;
		this.pincode=pincode;
	}
	public void display() {
		System.out.println(this.empid+ " "+this.empfname);
	}
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter id");
		int id=input.nextInt();
		
		System.out.println("Enter fname");
		String fname=input.next();
		
		System.out.println("Enter lname");
		String lname=input.next();
		
		System.out.println("Enter desk");
		int desk=input.nextInt();
		
		System.out.println("Enter location");
		String loc=input.next();
		
		System.out.println("Enter pin");
		int pin=input.nextInt();
		
		Typeofconstructor object=new Typeofconstructor(id,fname,lname,desk,loc,pin);
		object.display();
		input.close();
}
