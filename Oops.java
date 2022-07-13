package Day4;
//import java.util.Scanner;
public class Oops {
    String name;
    String firstname;
    String lastname;
    int age;
    int pincode;
    //default constructor
	Oops(){
    	this.name="Saurabh";
    	this.firstname="Saurabh";
    	this.lastname="Pandey";
    	this.age=22;
    	this.pincode=229404;
    	
    }
	public static void main(String[] args) {
	
		Oops object=new Oops();
		System.out.println(object.name);
		System.out.println(object.firstname);
		System.out.println(object.lastname);
		System.out.println(object.age);
		System.out.println(object.pincode);
	}

}
