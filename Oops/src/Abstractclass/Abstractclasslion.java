package Abstractclass;

abstract class Animals{
	 
	 abstract void roar();
	
}
class Lion extends Animals{
	
	 void roar() {
		System.out.println("Dog woolf");
	}

	
}
public class Abstractclasslion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals obj1=new Lion();
		obj1.roar();
		
	}

}
