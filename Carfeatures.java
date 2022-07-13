package Day5;

public class Carfeatures {

	String color;
	String brand;
	String model;
	int mfgyear;
	
	public Carfeatures(String color, String brand, String model, int mfgyear) {
		super();
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.mfgyear = mfgyear;
	}
	public void display() {
		System.out.println("This car is good");
		System.out.println("This car is good");
		System.out.println("This car is good");
		
	}
	
	public void speed() {
		System.out.println("100 km per hour speed");
	}
	
	public void about() {
		System.out.println("Car have an airbag");
		System.out.println("Power break");
	}
	public static void main(String[] args) {
		
        Carfeatures object= new Carfeatures("blue","honda","123",2013);
        System.out.println(object.color);
        System.out.println(object.brand);
        System.out.println(object.model);
        System.out.println(object.mfgyear);
        object.display();
        object.speed();
        object.about();
	}
}
