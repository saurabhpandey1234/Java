package inhertince;

class Teacher{
	String designation="Principle";
	String Collegename="FGIET";
}
public class Isainhertience extends Teacher{

	String name="Saurabh";
	String designation="teacher";
	public static void main(String[] args) {
		
		//creating object for the Isainhertience
		Isainhertience object=new Isainhertience();
		System.out.println(object.Collegename);
		System.out.println(object.designation);
		System.out.println(object.name);
		
		Teacher obj1=new Teacher();
		System.out.println(obj1.designation);

	}

}
