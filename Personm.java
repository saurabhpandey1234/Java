package Intorduction;

public class Personm {
	Personm father;
	Personm son;
	String name;
	String Address;
	
	public Personm(String name, String address) {
		super();
		this.name = name;
		this.Address = address;
		this.father=null;
		this.son=null;
	}
    
	public  String Father() {
		if(this.father==null) {
			return this.name;
		}
		else {
			Personm temp=this;
			while(temp.father!=null) {
				temp=temp.father;			
				}
		return temp.name;
		}
		
	}
	
	public  String Son() {
		if(this.son==null) {
			return this.name;
		}
		else {
			Personm temp=this;
			while(temp.son!=null) {
				temp=temp.son;			
				}
		return temp.name;
		}
		
	}




	public static void main(String[] args) {
		
		Personm []Ar= new Personm[10];
		Ar[0]=new Personm("Name1","Adress 1"); 
		Ar[1]=new Personm("Name2","Adress 2");
		Ar[5]=new Personm("Name3","Adress 3"); 
		Ar[0].son=Ar[1];
		Ar[1].father=Ar[0];
		Ar[5].father=Ar[1];
		Ar[1].son=Ar[5];
		System.out.println("Ancestor = "+Ar[5].Father());
		System.out.println("Predecessor = "+Ar[0].Son());
		

	}

}
