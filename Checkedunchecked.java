package Exceptions;

class LowbalanceException extends Exception{
	public String toString() {
		return "Balance Should not be less than 5000";
	}
}

public class Checkedunchecked {

	static void fun1() {
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println("Arthmetic Exception Dividing By Zero");
		}
	}
	
	static void fun2() {
		
		try {
			throw new LowbalanceException();
			
		}
		catch(LowbalanceException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		fun1();
		fun2();
	}

}
