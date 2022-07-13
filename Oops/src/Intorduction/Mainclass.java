package Intorduction;


//person class
class Person{
	
	String Fisrtname;
	String Lastname;
	
	//Creating Constructor 
	public Person(String fisrtname, String lastname) {
		super();
		Fisrtname = fisrtname;
		Lastname = lastname;
	}
	
	void Color() {
		
		System.out.println("Person Color is white ");
	}
	
	void age() {
		System.out.println("Person age is 20 year");
	}

	public String topMostAncestor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

//main class
public class Mainclass {

	int numbers;
	String names;
	int rollno;
	int marks;
	
	//creating Constructor
	public Mainclass(int numbers, String names, int rollno, int marks) {
		super();
		this.numbers = numbers;
		this.names = names;
		this.rollno = rollno;
		this.marks = marks;
	}


	public static void main(String[] args) {
		
		//creating object for the first student
		Mainclass obj=new Mainclass(1,"Saurabh",12,88);
		
		System.out.println(obj.numbers);
		System.out.println(obj.names);
		System.out.println(obj.rollno);
		System.out.println(obj.marks);
		
		System.out.println("========================");
		System.out.println("For the person class");
		
		//creating the object of the person class
		Personson p1=new Personson("Saurabh","Pandey");
		System.out.println(p1.Fisrtname);
		System.out.println(p1.Lastname);
		
		System.out.println("========================");
		//calling color method from the person class
		p1.Color();
		//calling age method
		p1.age();
		
		
	}

}
