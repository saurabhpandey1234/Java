package Intorduction;
import java.util.Scanner;
public class Maxmin {

	 static void getMinMax(int a[], int n)  
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
        
       System.out.println("maximum "+" : "+ maximum);
       System.out.println("Minimum :"+ minimum);
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		getMinMax(arr,n);
		sc.close();
	}

}
