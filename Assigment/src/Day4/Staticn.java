package Day4;

public class Staticn {

	static int num;
	static String name="Programmin";
	static String code="Java";
	static float pi=3.142f;
	static void display() {
		System.out.println("this statement belong to static");
		System.out.println("this statement belong to static");
		System.out.println("this statement belong to static");
		System.out.println("this statement belong to static");
		
	}
	void fun() {
		System.out.println("this statement belong to non static");
		System.out.println("this statement belong to non static");
		display();
	}
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(name);
		System.out.println(code);
		System.out.println(pi);
		display();
		Staticn object =new Staticn();
		object.fun();

	}

}
