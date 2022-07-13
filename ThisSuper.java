package Constructor;

class Rectangl{
	int length;
	int breadth;
	Rectangl(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void display() {
		System.out.println("Length "+this.length);
		System.out.println("Breadth "+this.breadth);
	}
}
public class ThisSuper {

	public static void main(String[] args) {
		
		Rectangl re=new Rectangl(10,10);
		re.display();

	}

}
