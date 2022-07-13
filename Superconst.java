package Constructor;
class Parent{
	Parent(){
		System.out.println("Non-Param Parent class");
	}
	Parent(int y){
		System.out.println("Param Parent class "+y);
	}
}

class Child extends Parent{
	
	Child(){
		System.out.println("Non Param child class");
	}
	Child(int y){
		System.out.println("Param child class");
	}
	Child(int x,int y){
		super(x);
		System.out.println("2 Param of child "+y);
	}
}
public class Superconst {

	public static void main(String[] args) {
		Child c=new Child(20,10);

	}

}
