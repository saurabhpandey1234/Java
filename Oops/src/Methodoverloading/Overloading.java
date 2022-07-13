package Methodoverloading;

//method overloading
class Displayoverloading{
	
	void display(char ch) {
		System.out.println(ch);
	}
	
	void display(char ch,int number) {
		System.out.println(ch+":"+number);
	}
	
	void display(int num) {
		System.out.println(num);
	}
	
	 void display(String name,float number) {
		 System.out.println(name+": "+number);
	 }
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Displayoverloading obj=new Displayoverloading();
		obj.display('A');
		obj.display('B',2);
		obj.display(1);
		obj.display("Saurabh",2);
	}

}
