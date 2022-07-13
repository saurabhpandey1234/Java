package Exceptions;

public class ThrowsVsThrow {

	 
		static int area(int length,int breadth) throws Exception {
			
			if(length<0 || breadth<0) {
				throw new Exception("Lenght and breadth cannot be less then 0");
			}
			int area1=length*breadth;
			return area1;
		}
		
		
	  static int meth2(int a,int b) {
	  
		  try { 
			  int c=a/b; 
			  return c;
		  } 
		  catch(Exception e) { 
			  e.getMessage();
			  return 1;
		  }
	  
	  } 
	  static void meth1() {
	  
	  //int r= meth2(10,0); 
		  
		  try {
		  int a=area(-10,5);
		  System.out.println(a);
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
	  }
	 

	public static void main(String[] args) {

		 meth1();

	}

}
