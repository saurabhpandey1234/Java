package Wrapperclasses;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		double number1=20;
		
		Integer obj1=Integer.valueOf(number);
		Double obj2=Double.valueOf(number1);

		if(obj1 instanceof Integer) {
			System.out.println("An object of Integer is createred");
		}
		if(obj2 instanceof Double) {
			System.out.println("an object of double is created");
		}
	}

}
