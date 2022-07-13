package Exceptions;

public class FinallyDemo {

	static void metho1() throws Exception{
		try {
			throw new Exception();
		}
		finally {
			System.out.println("Fianl message");
		}
		
	}
	public static void main(String[] args) throws Exception{
		
//		try {
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Final Message");
//		}	
		
		metho1();
	}

}
