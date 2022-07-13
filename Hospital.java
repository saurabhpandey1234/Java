package Abstractclass;

abstract class Hospitals{
	
	abstract void emergency();
	abstract void billing();
	abstract void appoinment();
	
}

class Myhospital extends Hospitals{
	Myhospital(){
		System.out.println("Saurabh");
	}
	
	@Override
	void emergency() {
		System.out.println(" patient should be admited ");
	}

	@Override
	void billing() {
		System.out.println("Saurabh");
		
	}

	@Override
	void appoinment() {
		System.out.println("Saurabh");
		
	}
}
public class Hospital {

	public static void main(String[] args) {
		
		Hospitals h=new Myhospital();
		
	}

}
