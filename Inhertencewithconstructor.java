package Day5;

class Studentinfo extends Inhertencewithconstructor{
	
	Studentinfo(int rollno,String name,String city,String state){
		super(rollno,name,city,state);
	}
}
public class Inhertencewithconstructor {

	int rollno;
	String stname;
	String city;
	String state;
	
	

	public Inhertencewithconstructor(int rollno, String stname, String city, String state) {
		super();
		this.rollno = rollno;
		this.stname = stname;
		this.city = city;
		this.state = state;
	}



	public static void main(String[] args) {
		
		//creating object of subclass
		Studentinfo obj =new Studentinfo(1,"Saurabh","Raebareli","Up");
		
		//adressing the object with refrence 
		System.out.println(obj.rollno);
		System.out.println(obj.stname);
		System.out.println(obj.city);
		System.out.println(obj.state);
	}

}
