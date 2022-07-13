package Interface;

interface Myinterface{
	
	public void display(int num);
	
	public void displayone(String name);
	public void displaytwo(float num);
	public void dispalythree(int age);
	
}
class Demo implements Myinterface{

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			System.out.println("Number is even "+num);
		}
		else {
			System.out.println("number is odd "+num);
		}
	}

	@Override
	public void displayone(String name) {
		// TODO Auto-generated method stub
		System.out.println("My name is :"+name);
	}

	@Override
	public void displaytwo(float num) {
		// TODO Auto-generated method stub
		if(num%3==0) {
			System.out.println("number is divisble by 3 ="+num);
		}
		else {
			System.out.println("Number is not diviible by 3 ="+num);
		}
	}

	@Override
	public void dispalythree(int age) {
		// TODO Auto-generated method stub
		if(age>=18) {
			System.out.println("Eligible for the vote: " +age);
		}
		else {
			System.out.println("not Eligible for the vote: " +age);
		}
		
	}
}
public class Interfaceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myinterface object =new Demo();
		object.display(12);
		object.displayone("Saurabh");
		object.displaytwo(2);
		object.dispalythree(18);
	}

}
