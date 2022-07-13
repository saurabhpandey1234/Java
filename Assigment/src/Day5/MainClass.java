package Day5;

//derived class
class Derivedclass extends MainClass{
	
	
	void add(int first,int second) {
		// sum of  two number
		System.out.println("Sum of two number  " +first + " + " +second +" = "+(first+second));
	}
}

// MainClass
public class MainClass {

	void evenoddcheck(int num) {
		
		// number is  even 
		if(num%2==0) {
			System.out.println("Number is even " +num);
		}
		//number is odd
		else {
			System.out.println("Number is odd " +num);
		}
		
	}
	
	void evenoddcheckupto20(int number) {
		
		//checking even odd upto 20
		for(int i=1;i<=number;i++) {
			// for even 
			if(i%2==0) {
				System.out.println("Number is even " +i);
			}
			//for odd
			else {
				System.out.println("Number is odd " +i);
			}
		}
	}
	
	void maxbttwonumber(int num1,int num2) {
		//largest between two number
		//first number is maximum
		if(num1>num2) {
			System.out.println("Number1 is greater then second one " +num1);
		}
		//second number is maximum
		else {
			System.out.println("Number 2 is greater then first one " +num2);
		}
	}
	
	void eligibalforvote(int age) {
		
		// person is eligible for vote
		if(age>=18) {
			System.out.println("Person is eligible for vote "+age);
			
		}
		// person is eligible for vote
		else {
			System.out.println("Person is not eligible for vote " +age);
		}
	}
	
	
	public static void main(String[] args) {
		
		//creating object of MainClass
		MainClass obj=new MainClass();
		//checking for even
		obj.evenoddcheck(3);
		
		//maximum between two number
		obj.maxbttwonumber(100, 35);
		
		//checking eligible for vote
		obj.eligibalforvote(24);
		
		//checking even odd 
		obj.evenoddcheckupto20(15);
		
		//creating object of derived class
		Derivedclass obj1= new Derivedclass();
		
		obj1.add(23, 24);
 
	}

}
