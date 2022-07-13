package inhertince;

interface Firstclass{
	 static void fun() {
		System.out.println("first class");
	}

	void display();
}
class Secondclass implements Firstclass{
	 public void display() {
		 System.out.println("Second class");
	 }
	 public void fun() {
			System.out.println("first class");
		}
}
public class Multiple {

	public static void main(String[] args) {
		Firstclass t=new Secondclass();
		t.display();
	}
}
