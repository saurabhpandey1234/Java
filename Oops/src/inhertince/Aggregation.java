package inhertince;

class Address{
	int houseno;
	String areaname;
	String landmark;
	String pin;
	String city;
	String State;
	
	public Address(int houseno, String areaname, String landmark, String pin, String city, String state) {
		super();
		this.houseno = houseno;
		this.areaname = areaname;
		this.landmark = landmark;
		this.pin = pin;
		this.city = city;
		this.State = state;
	}
	
}
public class Aggregation {

	int rollno;
	String studentname;
	Address studentaddr;
	
	public Aggregation(int rollno, String studentname, Address student) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentaddr = student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Address addr=new Address(1,"Unchahar","Raebareli","229404","Raebareli","UP");
	   
	   Aggregation stud=new Aggregation(2,"Saurabh",addr);
	   
	   System.out.println(stud.rollno);
	   System.out.println(stud.studentname);
	   
	   System.out.println("=====================");
	   
	   System.out.println(stud.studentaddr.houseno);
	   System.out.println(stud.studentaddr.city);
	   System.out.println(stud.studentaddr.areaname);
	   System.out.println(stud.studentaddr.landmark);
	   System.out.println(stud.studentaddr.pin);
	   System.out.println(stud.studentaddr.State);
	   
	   
	}

}
