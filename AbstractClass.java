package Abstractclass;
abstract class Animal{
	 abstract void woolf();
	
}
class Dog extends Animal{
	
	 void woolf() {
		System.out.println("Dog woolf");
	}

	
}

public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj=new Dog();
		obj.woolf();
		
		
		
	}

}
