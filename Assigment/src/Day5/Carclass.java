package Day5;

public class Carclass {

	String color;
	String brand;
	String model;
	int mfgyear;
	
	public Carclass(String color, String brand, String model, int mfgyear) {
		super();
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.mfgyear = mfgyear;
	}
	
	public static void main(String[] args) {
		
		//creating object
        Carclass object= new Carclass("blue","honda","123",2013);
        System.out.println(object.color);
        System.out.println(object.brand);
        System.out.println(object.model);
        System.out.println(object.mfgyear);
        
        
	}

}
