package Sortingcollection;

class bubble{
	
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" : ");
		}
	}
	static void bubblesort(int arr[]) {
			int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[i]) {
						temp=arr[i];
						 arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			
			
		}
}
public class Bubblesort {

	
	
	public static void main(String[] args) {
		
		int arr[]= {5,4,1,9,4};
		
		bubble sor=new bubble();
		System.out.println("");
		sor.print(arr);
		
		bubble.bubblesort(arr);
		System.out.println("========================");
		sor.print(arr);
		
	}

}
