package Assigments;

class User{
	 int userid;
	 String userfname;
	 String userlname;
	 String usercity;
	 public User(int userid, String userfname, String userlname, String usercity) {
		this.userid = userid;
		this.userfname = userfname;
		this.userlname = userlname;
		this.usercity = usercity;
	 }
	 void show() {
		 System.out.println("userid : "+userid+"\nuserfname : "+userfname+"\nuserlanme : "+userlname+"\nusercity : "+usercity);
		 System.out.println("=======================================================");
	 }
	 
}

class Employees{
	int empid;
	String empfnameemplaname;
	String empcity;
	String empstate;
	public Employees(int empid, String empfnameemplaname, String empcity, String empstate) {
		super();
		this.empid = empid;
		this.empfnameemplaname = empfnameemplaname;
		this.empcity = empcity;
		this.empstate = empstate;
	}
	void show1() {
		System.out.println("empid : "+empid+"\nempfnameemplaname : "+empfnameemplaname+"\nempcity : "+empcity+"\nempstate : "+empstate);
		System.out.println("=======================================================");
	}
}

class Product{
	int pid;
	String pname;
	String pdescription;
	int pprice;
	public Product(int pid, String pname, String pdescription, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.pprice = pprice;
	}
	void show2() {
		System.out.println("Pid : "+pid+"\npname : "+pname+"\npdescription : "+pdescription+"\npprrice : "+pprice);
		System.out.println("=======================================================");
	}
}

class Orders{
	int ordid;
	String ordname;
	String orddescription;
	int ordprice;
	public Orders(int ordid, String ordname, String orddescription, int ordprice) {
		super();
		this.ordid = ordid;
		this.ordname = ordname;
		this.orddescription = orddescription;
		this.ordprice = ordprice;
	}
	void show3() {
		System.out.println("ordid : "+ordid+"\nordname : "+ordname+"\norddescription : "+orddescription+"\nordprice : "+ordprice);
		System.out.println("=======================================================");
	}
}

public class Constructor_emp {

	public static void main(String[] args) {
		
		//user object is created
		User obj=new User(1,"Saurabh","Pandey","Raebareli");
		obj.show();
		
		//employee object is created
		Employees obj1=new Employees(1, "Saurabh Pandey","Raebareli", "UP");
		obj1.show1();
		
		//product object is created
		Product obj2=new Product(1,"Bike","Royal Infield Continental GT 650 ",350000);
		obj2.show2();
		
		//order object is created
		Orders obj3=new Orders(123,"Royal Infield","Will despach on today",350000);
		obj3.show3();
	}

}
