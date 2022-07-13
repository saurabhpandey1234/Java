package Constructor;

class Rectangle{
	 int length;
	static int breadth;
	
	Rectangle(){
		length=breadth=1;
	}
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	int area() {
		return length*breadth;
	}
}

class Cuboid extends Rectangle{
	int height;
	Cuboid(){
		height=1;
	}
	Cuboid(int h){
		height=h;
		
	}
	Cuboid(int l,int b,int h){
		super(l,b);
		height=h;
	}
	
	int volume() {
		
		return length*breadth*height;
	}
}

public class Superconst1 {

	public static void main(String[] args) {
		
		
		Cuboid cu=new Cuboid(10,5,10);
//		cu.length=10;
//		cu.breadth=5;
		System.out.println("Volume of the Cuboid "+cu.volume());
		System.out.println("Area of the reactangle "+cu.area());
		
		

	}

}
