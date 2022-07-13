package inhertince;

class Superconstructor{
	Superconstructor(){
		System.out.println("Constructor of the parent calss");
	}
}

public class Superclass extends Superconstructor{

	Superclass(){
		super();
		System.out.println("Constructor of the base class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass obj=new Superclass();
	}

}
