package java8methodreference;

interface Methodref{
	public void display();
}
public class Methodreference {

	static void saysomething() {
		System.out.println("hello, this is static method");
	}
	public static void main(String[] args) {
		
		Methodref obj=Methodreference::saysomething;
		obj.display();

	}

}
