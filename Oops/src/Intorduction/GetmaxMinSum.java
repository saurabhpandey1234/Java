package Intorduction;
import java.util.Scanner;
public class GetmaxMinSum {

	
	 public static int[] getMinMax(int a[], int n)  
	    {
		 //Maximum int array
	        int maximum=0;
	        for(int i=0;i<n;i++){
	            if(a[i]>maximum){
	                maximum=a[i];
	            }
	        }
	        
	        //minimum in the given array
	        int minimum=a[0];
	         for(int i=1;i<n;i++){
	            if(a[i]<minimum){
	                minimum=a[i];
	            }
	        }
	        int[] arr=new int[2];
	        arr[0]=maximum;
	        arr[1]=minimum;
	      
	        return arr;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=5;
		
		int minimum5=0;
		int maximum5=0;
		while(t>0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int[] ans1=getMinMax(arr, n);
			
			
			maximum5+=ans1[0];
			minimum5+=ans1[1];
			t--;
		}
		
		System.out.println("Minimum  of all 5 array " +minimum5);
		System.out.println("Maximum of all 5 array "+maximum5);
	}

}
