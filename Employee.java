package Assigments;
class Person{
	String Employeename;
	Double salary;
	int Startedyear;
	String insurencenumber;
	public Person(String employeename, Double salary, int startedyear, String insurencenumber) {
		super();
		Employeename = employeename;
		this.salary = salary;
		Startedyear = startedyear;
		this.insurencenumber = insurencenumber;
	}
	
    void Salary() {
    	System.out.println("Salary is : "+salary);
    }
    void name() {
    	System.out.println("Employee name : "+Employeename);
    }
	void startyear() {
		System.out.println("Start year is : "+Startedyear);
	}
	void insurencenumber() {
		System.out.println("Insureence number is : "+insurencenumber);
	}
}

public class Employee extends Person{
	public Employee(String employeename, Double salary, int startedyear, String insurencenumber) {
		super(employeename, salary, startedyear, insurencenumber);
		
	}

	public static void main(String[] args) {
		Employee obj=new Employee("saurabh",123.0,2022,"123");
        obj.Salary();
        obj.name();
        obj.startyear();
        obj.insurencenumber();
        
        System.out.println("==========================================");
        
        Employee obj1=new Employee("sarvesh",124.0,2022,"124");
        obj1.Salary();
        obj1.name();
        obj1.startyear();
        obj1.insurencenumber();
	}

	
}
