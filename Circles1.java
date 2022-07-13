package inhertince;

class Circle{
	public double radius;
	
	//area of circle
	public double area() {
		return Math.PI*radius*radius;
	}
	
	//Perimeter of the circle
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	//circumference of the circle
	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle{
	
	public double height;
	
	public double volume() {
		return area()*height;
	}
	
}
public class Circles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1=new Circle();
		c1.radius=5;
		System.out.println("Area of circle "+c1.area());
		System.out.println("circumference of the circle "+c1.circumference());
		System.out.println("Perimeter of the circle "+c1.perimeter());
		
		
		System.out.println("===============================================");
		
		Cylinder cy=new Cylinder();
		cy.height=10;
		System.out.println("volume of the cylinder "+cy.volume());
		
		
		System.out.println("===============================================");
		
	}

}
