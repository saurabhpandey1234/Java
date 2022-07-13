package Day5;

//subclass
class Technical extends Inhertencejava{
		
		String subject="Java Program";
}


public class Inhertencejava {

	// data member
	String designation="Trainer";
	String institute="Skillbout";
	
	// method - non static method
	
	public static void main(String[] args) {
		
		Inhertencejava obj=new Inhertencejava();
		System.out.println(obj.institute);
		System.out.println(obj.designation);
		//obj.does();
		Technical inst=new Technical();
		System.out.println(inst.subject); 
		

	}
	
}


