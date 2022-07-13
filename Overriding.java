package Methodoverriding;

class Super{
	void display() {
		System.out.println("Super Class");
	}
}
class Sub extends Super{
	void display() {
		System.out.println("Sub class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Super su=new Super();
		su.display();
	}
}
