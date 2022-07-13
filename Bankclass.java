package Abstractclass;

abstract class Bank{
	
	 abstract void savingaccount();
	 abstract void currentbalance();
	 abstract void currentaccount();
}
class Saving extends Bank{
	
	 
	 void currentbalance() {
		 System.out.println("Current balance is 1000");
	 }
	 void savingaccount() {
		 System.out.println("Saving Account");
	 }
	 void currentaccount() {
		 System.out.println("Current account");
	 }
 }
public class Bankclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj= new Saving();
		obj.currentaccount();
		obj.currentbalance();
		obj.savingaccount();
	}

}
