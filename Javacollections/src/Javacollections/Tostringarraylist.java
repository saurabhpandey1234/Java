package Javacollections;

class TostringArrayist{
	int empid;
	String empname;
	String empdesig;
	int empdesk;
	TostringArrayist(int empid, String empname, String empdesig, int empdesk) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdesk = empdesk;
	}
	
	public String toString() {
		return "Employeee "+empid +"\nempname "+empname+"\nempdesig "+empdesig+"\nempdesk "+empdesk;
	}
	
}
public class Tostringarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TostringArrayist obj = new TostringArrayist(1,"Saurabh", "pandey", 123);
		TostringArrayist obj1 = new TostringArrayist(1,"Saurabh", "pandey", 123);
		TostringArrayist obj2 = new TostringArrayist(1,"Saurabh", "pandey", 123);
		TostringArrayist obj3 = new TostringArrayist(1,"Saurabh", "pandey", 123);
		
		System.out.println(obj.toString());
		System.out.println("==================");
		
		System.out.println(obj1.toString());
		System.out.println("==================");
		
		System.out.println(obj2.toString());
		System.out.println("==================");
		
		System.out.println(obj3.toString());
		System.out.println("==================");
		
	}

	

}
